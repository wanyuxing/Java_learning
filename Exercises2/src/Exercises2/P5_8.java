package Exercises2;

import java.util.Scanner;

public class P5_8 {

	public static void main(String[] args) {
		//get inputs
		Scanner in = new Scanner(System.in);
		System.out.print("Please input a word: ");
		String input = in.next();
		in.close();
	    // output scrambled word
		System.out.println(scramble(input));
		}
	
	private static String scramble(String word)
	{
		if (word.length() > 3) {
		// convert String input into Char Array
		char[] wordArray = word.toCharArray();
	    // generate 2 different random numbers
		int random1, random2;
		random1 = (int) (Math.random() * (wordArray.length - 2) + 1);
		do {
			random2 = (int) (Math.random() * (wordArray.length - 2) + 1);}
		while (random2 == random1);
		// swap
		char temp = wordArray[random1];
		wordArray[random1] = wordArray[random2];
		wordArray[random2] = temp;
		// convert char array to String
		String scambleWord = String.valueOf(wordArray);
		return scambleWord;
		}
		else {return word;}
	}
}
