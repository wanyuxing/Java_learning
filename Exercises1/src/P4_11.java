import java.util.Scanner;

public class P4_11 {

	public static void main(String[] args) {
		// store a string input
		Scanner in = new Scanner(System.in);
		System.out.print("Pls enter a string: ");
		
		String input = in.next();
		
		// initilization
		char alf = '\0';
		int count = 0;
		
		// Count syllables
		for (int i = 1; i <= input.length(); i++)
		{
			alf = input.charAt(i - 1);
			if (alf == 'a' || alf == 'e' || alf == 'i' 
					|| alf == 'o' || alf == 'u' || alf == 'y')
			{
				count++;
			}
		}
		
		// adjust count
		if (input.charAt(input.length() - 1) == 'e') {count--;}
		
		if (count == 0) {count = 1;}
		
		// print out count
		System.out.println(count);
	}

}
