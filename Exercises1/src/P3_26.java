import java.util.Scanner;

public class P3_26 {

	public static void main(String[] args) {
		// store a number input
		Scanner in = new Scanner(System.in);
		System.out.print("Pls enter a number within 3999: ");
		int num = Integer.parseInt(in.next());
		
		// divide a num into thousands, hundreds, tens, and ones
		int one = num % 10;
		int ten = (int) (num % 100) / 10;
		int hun = (int) (num % 1000) / 100;
		int tho = (int) num / 1000;
		
		// convert one into Roman number
		String one_rom = "";
		
		switch (one) {
		case 1: one_rom = "I"; break;
		case 2: one_rom = "II"; break;
		case 3: one_rom = "III"; break;
		case 4: one_rom = "IV"; break;
		case 5: one_rom = "V"; break;
		case 6: one_rom = "VI"; break;
		case 7: one_rom = "VII"; break;
		case 8: one_rom = "VIII"; break;
		case 9: one_rom = "IX"; break;
		}
		
		// convert ten into Roman number
		String ten_rom = "";
		
		switch (ten) {
		case 1: ten_rom = "X"; break;
		case 2: ten_rom = "XX"; break;
		case 3: ten_rom = "XXX"; break;
		case 4: ten_rom = "XL"; break;
		case 5: ten_rom = "L"; break;
		case 6: ten_rom = "LX"; break;
		case 7: ten_rom = "LXX"; break;
		case 8: ten_rom = "LXXX"; break;
		case 9: ten_rom = "XC"; break;
		}
		
		// convert hun into Roman number
		String hun_rom = "";
		
		switch (hun) {
		case 1: hun_rom = "C"; break;
		case 2: hun_rom = "CC"; break;
		case 3: hun_rom = "CCC"; break;
		case 4: hun_rom = "CD"; break;
		case 5: hun_rom = "D"; break;
		case 6: hun_rom = "DC"; break;
		case 7: hun_rom = "DCC"; break;
		case 8: hun_rom = "DCCC"; break;
		case 9: hun_rom = "CM"; break;
		}
		
		// convert tho into Roman number
		String tho_rom = "";
		
		switch (tho) {
		case 1: tho_rom = "M"; break;
		case 2: tho_rom = "MM"; break;
		case 3: tho_rom = "MMM"; break;
		}
		
		// output the conversion
		if (tho > 0)
		{
			System.out.printf("%s%s%s%s", tho_rom, hun_rom, ten_rom, one_rom);
		}
		else if (hun > 0)
		{
			System.out.printf("%s%s%s", hun_rom, ten_rom, one_rom);
		}
		else if (ten > 0)
		{
			System.out.printf("%s%s", ten_rom, one_rom);
		}
		else {System.out.printf("%s", one_rom);}	
	}
}
