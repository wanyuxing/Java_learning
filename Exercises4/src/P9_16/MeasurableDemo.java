package P9_16;

class MeasurableDemo 
{
	public static void main(String[] args) 
	{
		Measurable[] countries = new Measurable[3];
		countries[0] = new Country("China", 1000);
		countries[1] = new Country("USA", 900);
		countries[2] = new Country("Japan", 100);
		System.out.println("The max area is: " + maximum(countries).getArea());
	}
	
	public static Measurable maximum(Measurable[] objects)
	{
		if (objects.length == 0) { return null;}
		Measurable max = null;
		for (Measurable object : objects)
		{
			if (max == null) { max = object; }
			else { if (object.getArea() > max.getArea()) { max = object; } }
		}
		return max;
	}
}
