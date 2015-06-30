import java.util.Scanner;

public class P2_17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Get the first and second time from inputs
		System.out.print("Plesase enter the first time: ");
		int first = in.nextInt();
		System.out.print("Please enter the second time: ");
		int second = in.nextInt();
		in.close();
		
		// Convert strings into numbers
		int first_hour = first / 100;
		int second_hour = second / 100;
		int first_minute = first % 100;
		int second_minute = second % 100;
		
		// Calculate difference
		int first_in_minutes = first_hour * 60 + first_minute;
		int second_in_minutes = second_hour * 60 + second_minute;	
		int gap;
		
		if (second_in_minutes > first_in_minutes) {
			gap = second_in_minutes - first_in_minutes;
		}
		else {
			gap = second_in_minutes - first_in_minutes + 24 * 60;
		}
		
		int gap_hour = gap / 60;
		int gap_minute = gap % 60;
		
		if (gap_hour > 1) {
			if (gap_minute > 1) {
				System.out.printf("%d Hours %d minutes", gap_hour, gap_minute);
			}
			else if (gap_minute == 1) {
				System.out.printf("%d Hours %d minute", gap_hour, gap_minute);
			}
			else {
				System.out.printf("%d Hours", gap_hour);
			}
		}
		else if (gap_hour == 1) {
			if (gap_minute > 1) {
				System.out.printf("%d Hour %d minutes", gap_hour, gap_minute);
			}
			else if (gap_minute == 1) {
				System.out.printf("%d Hour %d minute", gap_hour, gap_minute);
			}
			else {
				System.out.printf("%d Hour", gap_hour);
			}
		}
		else {
			if (gap_minute > 1) {
				System.out.printf("%d minutes", gap_minute);
			}
			else if (gap_minute == 1) {
				System.out.printf("%d minute", gap_hour, gap_minute);
			}
			else {
				System.out.printf("Sametime");
			}
		}
	}
}
