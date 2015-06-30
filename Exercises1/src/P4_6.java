import java.util.Scanner;

public class P4_6 {

	public static void main(String[] args) {
		// store inputs
		Scanner in = new Scanner(System.in);
		System.out.print("Pls input numbers (seprated by spaces): ");
		
		// set a boolean to be true and initialize minimum & input
		boolean first = true;
		double min = 0;
		double input = 0;
		
		// compare and get minimum out of all inputs
		while (in.hasNextDouble())
		{
			if (first)
			{
				min = in.nextDouble();
				first = false;
			}
			else
			{
				input = in.nextDouble();
				if (input < min) {min = input;}
			}
		}
		
		// print minimum
	    System.out.println(min);
	}
}
