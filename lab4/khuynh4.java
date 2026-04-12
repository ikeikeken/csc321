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
		String[] Response = new String[4];

		System.out.println("We have 4 items on our menu today. Please type your Selection.");
		
		for (counter = 0; counter < 4; counter++)
		{
			System.out.print(Menu[counter] + " ");
			
		}

		System.out.println("");
		
		Scanner input = new Scanner(System.in);
		
		userinput = input.next();

		System.out.println("You have chosen: " + userinput);

		Response[0] = "That is a staple. Good choice!";
		Response[1] = "Excellent choice that is my favorite!";
		Response[2] = "Caffiene is the best drug";
		Response[3] = "A weaker caffiene  source but still a caffiene source";

	
		for (counter = 0; counter < 4; counter++)
		{
			if (Menu[counter] .equals(userinput))			
			{
				System.out.println(Response[counter]);
			}	
		}
		

		
		/*
		counter = 0;

		while (userinput != Menu[counter])
		{
			counter++;
		}

		System.out.println(Response[counter]);
		*/
	}
}
