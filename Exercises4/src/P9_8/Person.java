package P9_8;
public class Person 
{
	private String name;
	private String birth;
	
	public Person(String name, String birth)
	{
		this.name = name;
		this.birth = birth;
	}
	
	public String getName()
	{ return this.name;}
	
	public String toString()
	{ return this.name + " is born on " + this.birth;}
}
