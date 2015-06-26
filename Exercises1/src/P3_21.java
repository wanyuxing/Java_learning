import java.util.Scanner;

public class P3_21 {

	public static void main(String[] args) {
		// store salary input
		Scanner in = new Scanner(System.in);
		System.out.print("Pls input your salary: ");
		int salary = Integer.parseInt(in.next());
		
		// evaluate the salary and calculate tax
		double tax;
		
		if (salary <= 50000)
		{
			tax = 0.01 * salary;
		}
		else if (salary <= 75000)
		{
			tax = 0.01 * 50000 + 0.02 * (salary - 50000);
		}
		else if (salary <= 100000)
		{
			tax = 0.01 * 50000 + 0.02 * 25000 + 0.03 * (salary - 75000);
		}
		else if (salary <= 250000)
		{
			tax = 0.01 * 50000 + 0.02 * 25000 + 0.03 * 25000 
					+ 0.04 * (salary - 100000);
		}
		else if (salary <= 500000)
		{
			tax = 0.01 * 50000 + 0.02 * 25000 + 0.03 * 25000 
					+ 0.04 * 150000 + 0.05 * (salary - 250000);
		}
		else {tax = 0.01 * 50000 + 0.02 * 25000 + 0.03 * 25000 
				+ 0.04 * 150000 + 0.05 * 250000 + 0.06 * (salary - 500000);}
		
		// output tax
		System.out.println(tax);
	}

}
