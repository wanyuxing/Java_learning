

import java.util.Scanner;

public class P5_25 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please input a zipcode: ");
		int input = in.nextInt();
		in.close();
		
		printBarCode(input);
	}
	public static void printDigit(int d) {
		// convert a number in zipcode into an array of digits representing the bars
		int[] barArray = new int[5];
		if (d == 0) {barArray = new int[]{1, 1, 0, 0, 0};}
		else {
			int temp = d;
			barArray[0] = d / 7;
			temp = temp - barArray[0] * 7;
			barArray[1] = temp / 4;
			temp = temp - barArray[1] * 4;
			barArray[2] = temp / 2;
			temp = temp - barArray[2] * 2;
			barArray[3] = temp;
			barArray[4] = (barArray[0] + barArray[1] + barArray[2] + barArray[3]) % 2;
		}
		for (int k = 0; k <= 4; k++) {
	    	printBar(barArray[k]);
	    }
	}
	public static void printBar(int n) {
		// print bars
		if (n == 0) {System.out.print(":");}
		else {System.out.print("|");}
	}
	public static void printBarCode(int zipCode) {
		// convert an integer into an array of digits
		int[] zipArray = new int[5];
		int temp = zipCode;
		int sum = 0;
		for (int i = 0; i <= Math.log10(zipCode); i++) {
			zipArray[i] = temp / (int) Math.pow(10, 4 - i);
			temp = temp - zipArray[i] * (int) Math.pow(10, 4 - i);
			sum = sum + zipArray[i];
		}
		// print postal bar code
		System.out.print("|");
		for (int j = 0; j <= Math.log10(zipCode); j++) {
			printDigit(zipArray[j]);
		}
		printDigit(10 - sum % 10);
		System.out.println("|");
	}
}
