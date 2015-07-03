package Exercises2;

public class Testing
	{
	public static void main(String[] args){
	  int i = 10;
	  int b = g(i);
	  System.out.println(b + i);
	  }
	
	public static int f(int i)
    {
	int n = 0;
	while (n * n <= i) {n++;}
	return n - 1;
	}

    public static int g(int a)
	{
	int b = 0;
	for (int n = 0; n < a; n++)
	{
	int i = f(n);
	b = b + i;
	}
	return b;
	}

}
