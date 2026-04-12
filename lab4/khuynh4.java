/*
Kenny Huynh
CSC-321
Lab 4
*/

import java.util.Scanner;

public class khuynh4
{
	public static void main(String[] args)
	{
		int counter;
		String userinput = "";


		String[] Menu ={ "Rice", "Noodles", "Coffe", "Tea"};

		System.out.println("We have 4 items on our menu today. Please type your Selection.");
		
		for (counter = 0; counter < 4; counter++)
		{
			System.out.print(Menu[counter]+ " ");
		}

		Scanner input = new Scanner(System.in);
		
		userinput = input.nextString();

		System.out.println("You have chosen: " + userinput);
		
	}
}
