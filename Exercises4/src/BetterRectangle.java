import java.awt.Rectangle;

public class BetterRectangle extends Rectangle
{
	public BetterRectangle(int x, int y, int width, int height)
	{
		super.setLocation(x, y);
		super.setSize(width, height);
	}
	
	// why the location & size parameters of the rectangle are all int, but perimeter & area are double?

	public double getPerimeter()
	{ return 2 * (super.getHeight() + super.getWidth());}
	
	public double getArea()
	{ return super.getHeight() * super.getWidth();}
}

// "Provide a program that tests the methods that you supplied", so where is that program?