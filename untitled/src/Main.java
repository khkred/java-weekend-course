import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Triangle smallTraingle = new Triangle(30,40,50);

        smallTraingle.area();


        int year;
        String model;
        String carType;


        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the year ");

        year = scan.nextInt();

        System.out.println("Enter the model");

        model = scan.nextLine();

        System.out.println("Enter the car type");

        carType = scan.nextLine();

Car tempcar = new Car(year,model,carType);

        System.out.println("the car year is"+tempcar.year);




    }

}
