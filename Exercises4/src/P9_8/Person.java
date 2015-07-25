package P9_8;
public class Person 
{
	private String name;
	private String birth; // better name this variable "yearOfBirth", "birth" isn't descriptive
	
	public Person(String name, String birth)
	{
		this.name = name;
		this.birth = birth; // so why there isn't getBirth method?
	}
	
	public String getName()
	{ return this.name;}
	
	public String toString()
	{ return this.name + " is born on " + this.birth;}
}
