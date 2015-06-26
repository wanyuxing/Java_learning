import java.util.Scanner;

public class P3_16 {

	public static void main(String[] args) {
		// store input
		Scanner in = new Scanner(System.in);
		
		System.out.print("Pls input 1st string: ");
		String stringA = in.next();
		
		System.out.print("Pls input 2nd string: ");
		String stringB = in.next();
		
		System.out.print("Pls input 3rd string: ");
		String stringC = in.next();
		
		// compare and output strings in lexicographic order
		if (stringA.compareTo(stringB) < 0) 
		{
			if (stringC.compareTo(stringA) < 0)
			{
				System.out.printf("%s %s %s", stringC, stringA, stringB);
			}
			else if (stringC.compareTo(stringB) < 0)
			{
				System.out.printf("%s %s %s", stringA, stringC, stringB);
			}
			else {System.out.printf("%s %s %s", stringA, stringB, stringC);}
		}
		else
		{
			if (stringC.compareTo(stringB) < 0)
			{
				System.out.printf("%s %s %s", stringC, stringB, stringA);
			}
			else if (stringC.compareTo(stringA) < 0)
			{
				System.out.printf("%s %s %s", stringB, stringC, stringA);
			}
			else {System.out.printf("%s %s %s", stringB, stringA, stringC);}
		}
	}

}
