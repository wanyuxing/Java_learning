import java.awt.Rectangle;

public class BetterRectangle extends Rectangle
{
	public BetterRectangle(int x, int y, int width, int height)
	{
		super.setLocation(x, y);
		super.setSize(width, height);
	}
	
	public double getPerimeter()
	{ return 2 * (super.getHeight() + super.getWidth());}
	
	public double getArea()
	{ return super.getHeight() * super.getWidth();}
}
