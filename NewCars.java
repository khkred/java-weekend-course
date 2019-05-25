class Car
{
	int maxSpeed = 100;

	int speed = 10;

	int noOfGears = 5;

	private int noOfAirbags = 2;

	void accelerate()
	{
		speed = speed+10;
		System.out.println("The current speed is: "+speed);

	}

	void brake()
	{
		speed = speed -5;
		System.out.println("The current speed is: "+speed);
	}
}

class AnotherCar extends Car
{
	String engineType = "V8";
}


public class NewCars
{
	public static void main(String[] args) {
		
		Car harishCar = new Car();

		AnotherCar anotherCar = new AnotherCar();

		anotherCar.noOfAirbags = 9;

		
	}
}
















