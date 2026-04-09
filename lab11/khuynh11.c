//Kenny Huynh
//CSC-321
//Lab 11
//April 7, 2026

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>

//int psquare(int side);
double hypo(double base, double height);

int main(void)
{
	/*
	int x = 0;
	int perimeter = 0;
	printf("Enter the length of a side of a square: ");
	scanf("%d",&x);

	//call
	perimeter = psquare(x);

	printf("The perimeter of the square is %d \n",perimeter);
	*/
	/*
	int x = 0;
	printf("Trick or Treat, type 1 for trick, type 2 for treat: ");
	scanf("%d",&x);

	if (x ++ 1)
	{
		trick();
	}
	else
	{
		treat();
	}
	*/
	
	double base = 0;
	double height = 0;
	double hypot = 0;

	printf("Enter a Base and Height: ");
	scanf("%lf %lf", &base, &height);
	printf("You have enter the base of %lf",base);
	printf(" and a height of %lf \n",height);
	
	hypot = hypo(base,height);
	
	printf("The hypotenuse is %lf\n",hypot);

	return EXIT_SUCCESS;
}

double hypo(double  base,double height)
{
	double c = sqrt(pow(base, 2) + pow(height, 2));
	return c;
}

/*
int psquare(int side)
{
	int calculation = 4 * side;
	return calculation;
}

void placed(int position, double time, char group)

	printf("You finsihed %d, with a time of %lf, and your group was %c \n", position, time, group);	
}

void trick(void)
{
	puts("booooooo...scary sounds....");
}

void treat(void)
{
	puts("*Gives you candy*");
}
*/
