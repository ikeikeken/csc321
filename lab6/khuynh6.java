//Kenny Huynh
//CSC321
//Lab #6

public class khuynh6
{
	public static void main(String[] args)
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

		//System.out.println();
		System.out.print("Java Output \n\n");
		System.out.print("Expression 1 \n");
		System.out.print("Int Total =  " + total1 + "\n");
		System.out.print("Double Total =  " + dtotal1 + "\n\n");

		System.out.print("Expression 2 \n");
		System.out.print("Int Total =  " + total2 + "\n");
		System.out.print("Double Total =  " + dtotal2 + "\n\n");
	
		System.out.print("Expression 3 \n");
		System.out.print("Int Total =  " + total3 + "\n");
		System.out.print("Double Total = " + dtotal3 + " \n");
	}
}
