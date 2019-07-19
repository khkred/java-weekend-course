public class BMW extends Car {

    String model = "730D";

    int maxSpeed = 300;



    void autoDrive()
    {
        System.out.println("The car is in auto drive mode");
    }

    @Override
    void accelerate() {

        super.currentSpeed = super.currentSpeed+30;
        System.out.println("This is a override method\nThe current speed of BMW is: "+currentSpeed);

    }
}
