

import java.util.Scanner;

public class P5_20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please input a year: ");
		int input = in.nextInt();
		in.close();
		System.out.println(input + " is a leap year? " + isLeapYear(input));
	}
	// a method determining whether a year is a leap year
	public static boolean isLeapYear(int year) {
		if (year % 400 == 0) {return true;}
		else if (year % 100 != 0 && year % 4 ==0) {return true;}
		else {return false;}
	}
}
