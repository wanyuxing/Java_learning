import java.util.Scanner;

public class P3_18 {
	public static void main(String[] args) {
		// store inputs including month and day
		Scanner in = new Scanner(System.in);
		
		System.out.print("Pls input the month: ");
		int mon = Integer.parseInt(in.next());
		
		System.out.print("Pls input the day: ");
		int day = Integer.parseInt(in.next());
		
		// assess mon and day to determine season
		String season = null;
		
		if (mon == 1 || mon == 2 || mon == 3)
		{
			season = "Winter";
		}
		else if (mon == 4 || mon == 5 || mon == 6)
		{
			season = "Spring";
		}
		else if (mon == 7 || mon == 8 || mon == 9)
		{
			season = "Summer";
		}
		else {season = "Fall";}
		
		if (mon % 3 == 0 && day >= 21)
		{
			if (season == "Winter") {season = "Spring";}
			else if (season == "Spring") {season = "Summer";}
			else if (season == "Summer") {season = "Fall";}
			else {season = "Winter";}
		}
		
		// print out season
		System.out.printf("%s", season);
	}
}
