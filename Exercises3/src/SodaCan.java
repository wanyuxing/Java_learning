public class SodaCan
{
	private double height;
	private double radius;
	
	public SodaCan(double height, double radius)
	{
		this.height = height;
		this.radius = radius;
	}
	
	public double getSurfaceArea()
	{
		return 2 * Math.PI * radius * height + Math.pow(radius, 2) * Math.PI * 2;
		// or you can write
		// return 2 * Math.PI * radius * (radius + height);
	}
	
	public double getVolume()
	{
		return Math.pow(radius, 2) * Math.PI * height;
	}

}
