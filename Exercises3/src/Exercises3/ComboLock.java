package Exercises3;

import java.util.Arrays;

public class ComboLock {
	private int[] secret = new int[3];
	private int[] ans = new int[3];
	private int count;

	public ComboLock(int secret1, int secret2, int secret3)
	{
		this.secret[0] = secret1;
		this.secret[1] = secret2 - 40;
		this.secret[2] = secret3;
		this.count = 0;
	}
	
	public void reset()
	{
		Arrays.fill(this.ans, 0);
		this.count = 0;
	}
	
	public void turnLeft(int ticks) 
	{ 
		if (this.count == 0) { this.ans[this.count] = -ticks;}
		else { this.ans[this.count] = this.ans[this.count - 1] - ticks;}
		this.count++;
	}
	
	public void turnRight(int ticks) 
	{ 
		if (this.count == 0) { this.ans[this.count] = ticks;}
		else { this.ans[this.count] = this.ans[this.count - 1] + ticks;}
		this.count++;
	}
	
	public boolean open()
	{ return Arrays.equals(this.secret, this.ans);}
}
