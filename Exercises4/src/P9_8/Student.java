package P9_8;

public class Student extends Person
{
	private String major;
	
	public Student(String name, String birth, String major)
	{
		super (name, birth);
		this.major = major; // why no "getMajor" method?
	}
	
	public String toString()
	{ return "The major of " + super.getName() + " is " + this.major;}
}
