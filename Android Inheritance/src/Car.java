public class Car {

    int noOfwheels = 4;

    int maxSpeed = 120;

    int noOfGears = 4;

    int currentSpeed = 20;

    void accelerate()
    {
        currentSpeed = currentSpeed+10;
        System.out.println("The current speed of the car is: "+currentSpeed);
    }

    void brake()
    {
        currentSpeed = currentSpeed-10;

        System.out.println("The current speed of the car is: "+currentSpeed);
    }
}
