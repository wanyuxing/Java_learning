public class SodaCan2 implements Measurable
{
	private double height;
	private double radius;
	
	public SodaCan2(double height, double radius)
	{
		this.height = height;
		this.radius = radius;
	}
	
	public double getSurfaceArea()
	{ return 2 * Math.PI * this.radius * this.height + Math.pow(this.radius, 2) * Math.PI * 2;}
}
