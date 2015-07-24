package P9_16;

public class Country implements Measurable
{
	private String name;
	private double area;
	
	public Country(String name, double area)
	{ 
		this.name = name;
		this.area = area; 
	}
	
	public double getArea()
	{ return this.area;}
	
	public void setArea(double area)
	{ this.area = area; }
}
