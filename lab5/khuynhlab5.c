//Kenny Huynh
//CSC-321
//lab #5

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
	//printf("Hello World \n");

	int x;
	x = 5;

	double y;
	y = 1.8;

	float z;
	z = 6.18;


	char j;
	j ='j';


	printf("Variable x = %d \n",x);
	printf("Variable y = %lf \n",y);
	printf("Variable z = %f \n",z);
	printf("Variable j = %c \n",j);	

	if (x==5)
	{
		printf("Variable x = %d \n",x);
		printf("Variable y = %lf \ n",y);
	}
	else
	{
		puts("This puts statement can only be text");
	}

	int array[10] = {0,6,1,8,9,7,2,18,19,95};
	int arraycount = 0;

	for (arraycount = 0; arraycount < 10; arraycount++)
	{
		//printf("array[%d] = %d \n",arraycount,array[arraycount]);
		printf("array[%d] address = %p \n",arraycount,&array[arraycount]);

	}	

	return EXIT_SUCCESS;
}

