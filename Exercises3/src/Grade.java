import java.util.ArrayList;

// good!

public class Grade {
	private ArrayList<Double> grades;
	private double total;
	
	public Grade(String grade)
	{
		this.grades = new ArrayList<Double>();
		this.grades.add(this.convert(grade));
	}
	
	public void addGrade(String grade)
	{
		this.grades.add(this.convert(grade));
	}
	
	public double getGPA()
	{
		total = 0;
		for (int i = 0; i < this.grades.size(); i++) { total += this.grades.get(i);}
		return total / this.grades.size();
	}
	
	public double convert(String grade)
	{
		if (grade.equals("A+")) { return 4.3;}
		else if (grade.equals("A")) { return 4;}
		else if (grade.equals("A-")) { return 3.7;}
		else if (grade.equals("B+")) { return 3.3;}
		else if (grade.equals("B")) { return 3;}
		else { return 2.7;}
	}

}
