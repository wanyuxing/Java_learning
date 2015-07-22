

import java.util.Scanner;
import java.util.ArrayList;

public class P6_23 {
	public static void main(String[] args) {
		// read captions and values via two ArrayLists
		Scanner in = new Scanner(System.in);
		ArrayList<String> captions = new ArrayList<String>();
		ArrayList<Integer> values = new ArrayList<Integer>();
		// record the length of the longest caption and the largest value
		int captionLength = 0;
		int valueLarge = 0;
		boolean isInput = true;
		do {
		System.out.print("Please input a caption, otherwise input 'end': ");
		String temp = in.next();
		if (temp.length() > captionLength) {captionLength = temp.length();}
		if (!temp.equals("end")) {
			captions.add(temp);
			System.out.print("Please input corresponding value: ");
			int valueTemp = in.nextInt();
			if (valueTemp > valueLarge) {valueLarge = valueTemp;}
			values.add(valueTemp);
			}
		else {System.out.println("read completed"); in.close(); isInput = false;}
		} while (isInput);
		
		String format = "%" + captionLength + "s" + " ";
		for (int i = 0; i < captions.size(); i++) {
			System.out.printf(format, captions.get(i));
			int num = 40 * values.get(i) / valueLarge;
			for (int j = 1; j <= num; j++) {System.out.print("*");}
			System.out.println();
		}
	}
}
