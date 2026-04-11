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
		
		if(userinput == 3)
		{
			int counter = 0;
			while (counter != randomnumber)
			{
				System.out.println("You won and guessed the number correctly!");
				counter++;
			}
		}
		
	}
}
