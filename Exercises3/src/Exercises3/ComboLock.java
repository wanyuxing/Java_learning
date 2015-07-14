package Exercises3;

public class ComboLock {
	private int tickPos;
	private int secret1;
	private int secret2;
	private int secret3;
	private int count;
	private boolean secret1Open;
	private boolean secret2Open;
	private boolean secret3Open;
	
	public ComboLock(int secret1, int secret2, int secret3)
	{
		this.secret1 = secret1;
		this.secret2 = secret2;
		this.secret3 = secret3;
		this.tickPos = 0;
		this.count = 0;
	}
	
	public void reset()
	{
		this.tickPos = 0;
		this.count = 0;
	}
	
	public void turnLeft(int ticks) 
	{ 
		this.tickPos -= ticks;
		count++;
		if (count == 2) { if (this.tickPos == (this.secret2 - 40)) { this.secret2Open = true;}}
	}
	
	public void turnRight(int ticks) 
	{ 
		this.tickPos += ticks;
		this.count++;
		if (count == 1) { if (this.tickPos == this.secret1) { this.secret1Open = true;}}
		else if (count == 3) { if (this.tickPos == this.secret3) { this.secret3Open = true;}}
	}
	
	public boolean open()
	{ return this.secret1Open & this.secret2Open & this.secret3Open;}
}
