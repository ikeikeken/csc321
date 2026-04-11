//Kenny Huynh
//CSC-321
//Lab 9

import java.util.Scanner;

public class khuynh9
{
	public static void main(String[] args)
	{
		int randomnumber = 3;
		int userinput;

		System.out.print("Please guess a number between 1 - 20: ");
		Scanner input = new Scanner(System.in);

		userinput = input.nextInt();

		System.out.println("You have entered " + userinput);
		
		while (userinput > 20 || userinput < 1)
		{
			System.out.print("You have entered an invalid number!\nPlease enter a number between 1 - 20: ");
			userinput = input.nextInt();
		}
		
		if(userinput == randomnumber)
		{
			int counter = 0;
			while (counter != randomnumber)
			{
				System.out.println("You won and guessed the number correctly!");
				counter++;
			}
		}
		else if (userinput > randomnumber)
		{
			System.out.println("You lost and your guess is higher than my number: " + randomnumber);
		}
		else if (userinput < randomnumber)
		{
			System.out.println("You lost and your guess is lower than my number: " + randomnumber);
		}
		else
		{
			System.out.println("THE IF STATEMENT FAILED");
		}
	}
}
