public class Testing {

	public static void main(String[] args) 
	{
		ComboLock sd = new ComboLock(20, 30, 10);
		sd.turnRight(20);
		sd.turnLeft(30);
		sd.reset();
		sd.turnRight(20);
		sd.turnLeft(30);
		sd.turnRight(20);
		System.out.println(sd.open());
	}

}
