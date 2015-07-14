package Exercises3;

import java.util.Scanner;

public class P8_14 {

	public static void main(String[] args) 
	{
		System.out.print("Please input the radius of a sphere: ");
		Scanner in = new Scanner(System.in);
		double r = in.nextDouble();
		System.out.printf("The radius of a sphere is: %f\n", r);
		System.out.printf("The volume of the sphere is: %f\n", Geometry.sphereVolume(r));
	}

}
