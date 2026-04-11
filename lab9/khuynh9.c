//Kenny Huynh
//CSC-321
//Lab 9

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main(void)
{
	//double input = 0;
	int input = 0;
	int rnumber = 3;
	bool valid = 0;

	printf("Please guess a number between 1 - 20: ");

	//scanf("%lf",&input);

	scanf("%d",&input);

	//printf("\nYou have entered: %lf",input);
	
	while (input > 20 || input < 1)
	{
		printf("You have entered an invalid number. \nPlease enter a valid number: ");
		scanf("%d",&input);
	}
	
	printf("You have entered: %d\n",input);

	if(input == rnumber)
	{
		int counter = 0;
		while (counter < rnumber)
		{	
			printf("You guessed correctly!\n");
			counter++;
		}
	}

}



