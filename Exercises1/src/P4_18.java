import java.util.Scanner;

public class P4_18 {

	public static void main(String[] args) {
		// store an integer input
		Scanner in = new Scanner(System.in);
		System.out.print("Pls enter a positive integer: ");
		int input = Integer.parseInt(in.next());
		
		// print prime integers
		for (int i = 1; i <= input; i++)
		{
			if (prime(i)) {System.out.print(i); System.out.print(" ");}
		}
	}
	
	// define a method evaluating whether a positive integer is a prime
			private static boolean prime (int num)
			{
				int count = 0;
				
				for (int i = 2; i < num; i++)
				{
					if (num / i == (double) num / i) {count++;}
				}
				if (count > 0) {return false;}
				else {return true;}
			}
}
