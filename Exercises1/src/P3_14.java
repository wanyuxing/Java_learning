import java.util.Scanner;

public class P3_14 {
	public static void main(String[] args) 
	{
		// get inputs
		Scanner in = new Scanner(System.in);
		System.out.print("Plesase enter your card: ");
		String input = in.next();
		in.close();
		
		String card_num = null;
		
		if (input.length() == 2) 
		{
			char num = input.charAt(0);
					
			// convert the first char into a string
		    switch (num) {
				case '2': card_num = "2"; break;
				case '3': card_num = "3"; break;
				case '4': card_num = "4"; break;
				case '5': card_num = "5"; break;
				case '6': card_num = "6"; break;
				case '7': card_num = "7"; break;
				case '8': card_num = "8"; break;
				case '9': card_num = "9"; break;
				case 'J': card_num = "Jack"; break;
				case 'Q': card_num = "Queen"; break;
				case 'K': card_num = "King"; break;
				case 'A': card_num = "Ace"; break;
				}	
		}
		else 
		{
			card_num = "10";
		}
		
		// convert the second char into a string
		
		char name = input.charAt(input.length() - 1);
		
	    switch (name)
	    {
			case 'D': card_num += " of Diamonds"; break;
			case 'H': card_num += " of Hearts"; break;
			case 'S': card_num += " of Spades"; break;
			case 'C': card_num += " of Clubs"; break;
		}    
	    System.out.print(card_num);
    }
}