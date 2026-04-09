/Kenny Huynh
//CSC321
//Lab #10

import java.util.Scanner;

public class khuynh10
{
	public static void main(String[] args)
	{
		double radius = 0;
		double height = 0;

		System.out.print("Please enter the radius and height of the cylinder: ");
		Scanner input = new Scanner(System.in);
		
		radius = input.nextDouble();
		height = input.nextDouble();
		
		double cylindervolume = cylindervol(radius,height);

		System.out.println("\nThe volume is: " + cylindervolume);`

	}

	static double cylindervol(double radius, double height)
	{
		//volume formula for a cylinder is V=πrrh
		double volume = 0;
		double pi = Math.PI;
		volume = pi * radius * radius * height;

		return volume;
			
	}
}
