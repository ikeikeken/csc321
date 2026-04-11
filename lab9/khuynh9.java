//Kenny Huynh
//CSC-321
//Lab 9

import java.util.Scanner;

public class khuynh9
{
	public static void main(String[] args)
	{
		int userinput;

		System.out.print("Please guess a number between 1 - 20: ");
		Scanner input = new Scanner(System.in);

		userinput = input.nextInt();

		System.out.print("You have entered" + userinput);
	}
}
