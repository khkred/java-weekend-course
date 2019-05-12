import java.util.Scanner;

public class Loops
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		//Let's say we want to print 1,2,3,4,5

		// int a, b, c, d, e;

		// a = 1;
		// b = 2;
		// c = 3;
		// d = 4;
		// e = 5;

		// System.out.println(a+" "+b+" "+c+" "+d+" "+e);

		//We want to print 100 numbers

		// We will use loops to print 100 numbers

		// the first loop that we are going to use is called "while" loop

		System.out.println("While loop to print 100 numbers");

		int f = 1;

		while(f <= 100)
		{
			System.out.println(f);

			f = f+1; 
		}

		// for loop 

		System.out.println("For loop to print 100 numbers");

		for(f =1; f <= 100; f=f+1)
		{
			System.out.println(f);
		}

	}
}

















