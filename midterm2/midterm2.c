//Kenny Huynh
//CSC-321-40
//Midterm 2
//04-23-26

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void printnamenum(int user);

int main (void)
{
	int user;
	//char myname[] = "Kenny";

	//printf("%s\n",myname);
	//printf("length of name: %lu\n",strlen(myname));
	
	//printnamenum(1);
	
	printf("Please enter a whole number: ");
	scanf("%d",&user);

	for (int counter = 0; counter <5; counter++)
	{
		printnamenum(user);
	}
	
	return EXIT_SUCCESS;
}

void printnamenum(int user)
{
	char myname[] = "Kenny";

	//printf("My name is: %s\n",myname);
	printf("%s%d\n",myname,user);
}
