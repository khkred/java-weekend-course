import java.util.Scanner;

public class Conditional
{
	public static void main(String[] args) {

		// if and else

		Scanner scan = new Scanner(System.in);

		int balance, withdrawAmount;

		balance = 10000;

		// Here we want to get withdraw amount from the user

		System.out.println("Enter the amount :");

		withdrawAmount = scan.nextInt();

		if(balance > withdrawAmount)
		{
			balance = balance - withdrawAmount;

			System.out.println("You have withdrawn "+withdrawAmount+ 
				"\nYour remaining balance is: "+balance);
		}
		else
		{
			System.out.println("Insufficent Funds. \nPlease Try again");
		}

		

	}
}