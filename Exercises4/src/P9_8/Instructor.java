package P9_8;

public class Instructor extends Person
{
	private int salary;
	
	public Instructor(String name, String birth, int salary)
	{
		super(name, birth);
		this.salary = salary;
	}
	
	public String toString()
	{ return "The salary of " + super.getName() + " is: " + this.salary;}
}
