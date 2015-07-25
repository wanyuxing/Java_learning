package P9_14;

import java.util.ArrayList;
import java.util.Scanner;

public class MeasurableDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Measurable> Cans = new ArrayList<Measurable>();
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("Pls input the height and radius of a new can(input 'End' to end): ");
			String a = in.next();
			if (a.equals("End")) { break;}
			else { Cans.add(new SodaCan2(Double.parseDouble(a), in.nextDouble())); }
		} while (true);
		System.out.println("Average surface area is: " + average(Cans));
	}
	
	// creating this "average" method isn't absolutely necessary
	public static double average(ArrayList<Measurable> objects)
	{
		if (objects.size() == 0) { return 0; }
		double sum = 0;
		for (Measurable obj : objects)
		{ sum = sum + obj.getSurfaceArea(); }
		return sum / objects.size();
	}
}


