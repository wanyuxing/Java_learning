import java.util.Scanner;

public class P3_14 {
	public static void main(String[] args) 
	{
		// get input
		Scanner in = new Scanner(System.in);
		System.out.print("Plesase enter your card: ");
		String input = in.next();
		
		if (input.length() == 2) 
		{
			char num = input.charAt(0);
					
			// convert the first char into a string
			String card_num = null;
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
			
		    // general output
		    System.out.printf("%s of ", card_num);
		}
		else 
		{
			System.out.printf("10 of ");
		}
		
		// convert the second char into a string
		String card_name = null;
		char name = input.charAt(input.length() - 1);
		
	    switch (name)
	    {
			case 'D': card_name = "Diamonds"; break;
			case 'H': card_name = "Hearts"; break;
			case 'S': card_name = "Spades"; break;
			case 'C': card_name = "Clubs"; break;
		}    
	    System.out.print(card_name);
    }
}