import java.util.Scanner;

public class SwitchExamples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");

        int a = scanner.nextInt();

        /**
         * We are going to write the above if and else statements in a new syntax called "Switch"
         */

        switch (a)
        {
            case 1:
                System.out.println("The value entered is 1");
                break;
            case 2:
                System.out.println("The Value entered is 2");
                break;

            case 3:
                System.out.println("The Value entered is 3");
                break;

            default:System.out.println("The Value entered is other than 1,2 and 3");
        }

//         We are going to take a look at Switch Statement with char

        System.out.println("Enter a character");

        char c = 'a';

        switch (c)
        {
            case 'a' :System.out.println("Value is a");
            break;

            case 'b': System.out.println("Value is b");
            break;

            default: System.out.println("The value is neither a nor b");
            break;
        }

        System.out.println("Enter the month");

        /*
        Switch statement using Strings
         */

        String month = scanner.nextLine();

        switch (month.toLowerCase())
        {
            case "january": System.out.println("The month is January");
            break;

            case "february": System.out.println("The month is Feb");
            break;

            case "march": System.out.println("The month is Mar");
            break;

            default: System.out.println("The month is not Jan, Feb or March");
            break;
        }



    }
}

















