import java.awt.Point;

public class LabeledPoint extends Point
{
	private String label;
	
	public LabeledPoint(int x, int y, String label)
	{
		super(x, y);
		this.label = label;
	}
	
	public String toString()
	{ return "The location is (" + super.getX() + ", " + super.getY() + "), and the label is: " + this.label;}
}
