package Exercises2;

import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.io.IOException;

public class P7_17 
{
	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
	
		try
		{
			System.out.print("Please type in your input filename: ");
			String inputFileName = console.next();
			console.close();	
			process(inputFileName);
		}
		catch (FileNotFoundException exception)
		{
			System.out.println("File not found.");
		}
		catch (NoSuchElementException exception)
		{
			System.out.println("File contents invalid.");
		}
		catch (IOException exception)
		{
			exception.printStackTrace();
		}
	}

	private static void process(String filename) throws IOException
	{
		File inputFile = new File(filename);
	    Scanner in = new Scanner(inputFile);
		in.useDelimiter(";");
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> services = new ArrayList<String>();
		ArrayList<String> sales = new ArrayList<String>();
		ArrayList<String> dates = new ArrayList<String>();
		ArrayList<String> servicesType = new ArrayList<String>();
		PrintWriter out = new PrintWriter("Testing.txt");
		
		try
		{
			// Read inputs from file
			while (in.hasNextLine())
			{
				names.add(in.next().trim());
				services.add(in.next().trim());
				sales.add(in.next().trim());
				dates.add(in.next().trim());
			}
			for (int i = 0; i < names.size(); i++) {System.out.printf("%s; ", names.get(i)); System.out.println();}
			for (int i = 0; i < services.size(); i++) {System.out.printf("%s; ", names.get(i)); System.out.println();}
			for (int i = 0; i < sales.size(); i++) {System.out.printf("%s; ", names.get(i)); System.out.println();}
			for (int i = 0; i < dates.size(); i++) {System.out.printf("%s; ", names.get(i)); System.out.println();}
			
			// Find service types
			servicesType.add(services.get(0));
			
			for (int m = 0; m < services.size(); m++)
			{
				for (int n = 0; n < servicesType.size(); n++)
				{ if (services.get(m) != servicesType.get(n)) { servicesType.add(services.get(m));}}
			}
			
			// Output files with regards to types of services
			for (int i = 0; i < servicesType.size(); i++)
			{
				out = new PrintWriter("servicesType.get(i).txt");
				for (int j = 1; j < services.size(); j++)
				{
					if (services.get(j) == servicesType.get(i)) 
					{
						out.printf("%s; ", names.get(i));
						out.printf("%s; ", sales.get(i));
						out.printf("%s; ", dates.get(i));
						out.println();
					}
				}
			}
		}
		finally
		{ 
			in.close();
			out.close();
		}	
	}
}
