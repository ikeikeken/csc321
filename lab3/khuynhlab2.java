//Kenny Huynh
/*
*CSC321
*LAB #3
*/

import java.util.Scanner;

public class khuynh3
{
	public static void main(String[] args)
	{
		int x = 15;
		int i = 0;

		System.out.println("Enter an integer:");
		Scanner input = new Scanner(System.in);
		int userinput = input.nextInt();
		
		System.out.println("Enter a decimal number: ");
		float userinput2 = input.nextFloat();

		System.out.println("Enter a letter: ");
		String letter = input.next();
		char userinput3 = letter.charAt(0);

		System.out.println("Enter a phrase: ");
		String userinput4 = input.next();


		if (userinput > 10)
		{
			System.out.println("You entered " + userinput + " Which is greater than 10");
		}
		else 
		{
			System.out.println("You enter a number less than 11");
		}
		
		if (userinput2 > 5)
		{
			System.out.println("You have entered: " + userinput2 + ". Your decimal number is greater than 5.0");
		}
		else if (userinput == 5)
		{
			System.out.println("You have entered: 5.0");
		}
		else
		{
			System.out.println("You have entered: " + userinput2 + " which is less than 5.0");
		}
		
		if (userinput3 != 'k')
		{
			System.out.println("You did not enter the character 'K'!");
		}
		else
		{
			System.out.println("You have entered: 'K'! Great Choice!");
		}
		
		if ( userinput4.isEmpty() == true)
		{
			System.out.println("The string is empty.");
		}
		else
		{
			System.out.println("You have entered: " + userinput4);
		}

		for (i = 0; i < 6; i++)
		{
			System.out.println("Why do we pronounce the 'G' in Longevity twice?");
		}
		while (x > 9)
		{
			System.out.println("Rush Hour");
			x--;
		}
	}
}

