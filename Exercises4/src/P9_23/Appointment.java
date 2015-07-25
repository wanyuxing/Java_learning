package P9_23;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.NoSuchElementException;

class Appointment 
{
	private String description;
	private String date; // in format yyyymmdd
	// why don't you use 3 int to store year, date, month? won't that make your life easier?
	private ArrayList<Appointment> appointments = new ArrayList<Appointment>(); // shouldn't it be in AppointmentBook class instead of here?
	// remember, this is an Appointment class, which is the abstraction of a SINGLE appointment 
	private PrintWriter out;
	
	Appointment(String description, String date)
	{
		this.description = description;
		this.date = date;
		appointments.add(this);
	}
	
	String getDescription()
	{ return this.description; }
	
	String getDate()
	{ return this.date; }
	
	boolean occursOn(int year, int month, int day)
	{ 
		DecimalFormat df = new DecimalFormat("00");
		String monthStr = df.format(month);
		String dayStr = df.format(day);
		return date.substring(0, 4).equals(Integer.toString(year)) && date.substring(4, 6).equals(monthStr) && date.substring(6).equals(dayStr); 
	}
	

	// putting addAppointment here doesn't make sense
	void addAppointment(String type, String description, String date)
	{
		if (type.equals("daily")) { appointments.add(new Daily(description, date)); }
		if (type.equals("monthly")) { appointments.add(new Monthly(description, date)); }
		if (type.equals("onetime")) { appointments.add(new Onetime(description, date)); }
	}
	

	// save() and load() shouldn't be here. think it through.
	void save() throws FileNotFoundException
	{
		Scanner console = new Scanner(System.in);
		System.out.print("Output file: ");
		String outputFileName = console.next();
		console.close();
		out = new PrintWriter(outputFileName);
		
		for (Appointment obj : appointments)
		{ out.println(obj.getClass().getSimpleName().toString() + ',' + obj.getDescription() + ',' + obj.getDate()); }
		out.close();
	}
	
	void load() throws FileNotFoundException
	{
		try
		{
			Scanner console = new Scanner(System.in);
			System.out.print("Input file: ");
			File inputFile = new File(console.next());
			console.close();
			Scanner in = new Scanner(inputFile);
			
			while (in.hasNextLine())
			{
				String line = in.nextLine();
				if (this.getClass().getSimpleName().equals(line.split(",")[0])) { System.out.println(line);}
			}
			in.close();
		}
		catch (FileNotFoundException exception)
		{
			System.out.println("File not found.");
		}
		catch (NoSuchElementException exception)
		{
			//System.out.println("File contents invalid.");
			exception.printStackTrace();
		}
	}
}
