public class Car 
{
	private double milePerGallon;
	private double gallon;
	
	public Car(double milePerGallon)
	{
		this.milePerGallon = milePerGallon;
	}
	
	public void addGas(double gallon)
	{
		this.gallon += gallon; 
		// it's better to choose a variable name other than "gallon" to avoid confusing, because these two "gallon" have different meaning
	}
	
	public void drive(double miles)
	{
		
		if ((this.gallon - miles / this.milePerGallon) < 0) 
		{ 
			this.gallon = 0;
		}
		else
		{
			this.gallon -= miles / this.milePerGallon;
		}
	}
	
	public double getGasLevel()
	{
		return this.gallon;
	}
}
