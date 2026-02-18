//Kenny Huynh
//CSC-321
//lab #6

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
	//variables
	int x = 5;
	int y = 6;
	double c = 5;
	double v = 6;

	//expressions intialize
	int total1 = 0;
	double dtotal1 = 0;
	int total2 = 0;
	double dtotal2 = 0;
	int total3 = 0;
	double dtotal3 = 0;

	//update
	total1 = x+y*x/y-x;
	dtotal1 =c+v*c/v-c;

	total2 = -x-y/x*y+x;
	dtotal2 = -c-v/c*v+c;

	total3 = x+y-x/y;
	dtotal3 = c+v-c/v;

	printf("C Output \n\n");
	printf("Expression 1 \n");
	printf("Int Total = %d \n",total1);
	printf("Double Total = %lf \n\n",dtotal1);

	printf("Expression 2 \n");
	printf("Int Total = %d \n",total2);
	printf("Double Total = %lf \n\n",dtotal2);

	printf("Expression 3 \n");
	printf("Int Total = %d \n",total3);
	printf("Double Total = %lf \n",dtotal3);

	return EXIT_SUCCESS;
}
