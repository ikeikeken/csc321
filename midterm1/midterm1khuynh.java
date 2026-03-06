//Kenny Huynh
//CSC321
//Midterm Exam #1

import java.util.Scanner;

public class khuynhmidterm1
{
	public static void main(String[] args)
	{
		//variables
		int mynumber = 15;
		Scanner input = new Scanner(System.in);

		//System.out.println();
		System.out.print("Please guess my number(Whole Numbers ONLY): ");
		int x = input.nextInt();

		if (x > mynumber)
		{
			System.out.print("You guessed to high!\nYOU LOSE!!!");
		}
		else if (x < mynumber)
		{
			System.out.print("You guessed too low!\nYOU LOSE!!!");
		}
		else 
		{
			System.out.print("You guessed my number!\nYOU WIN!!!");
		}


	}
}
