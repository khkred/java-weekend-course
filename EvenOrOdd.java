import java.util.Scanner;

public class EvenOrOdd
{

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);

		int a;

		System.out.println("Enter a number check if it's even or odd");

		a = scan.nextInt();

		//if a number is divisible by 2 it's even
		//if the number is not divisible by 2 it's odd

		if (a%2 == 0) {

			System.out.println(a+ " is an even number");
			
		}
		else
		{
			System.out.println(a+ " is an odd number");
		}
		

	}

}