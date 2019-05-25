class Greeting
{
	//states, variable, properties
	String name = "Harish";

	//methods
	void greet(String name)
	{
		System.out.println("Great to have you here: "+name);
	}
}

public class NewClasses
{
	public static void main(String[] args) {
		
		Greeting g1 = new Greeting();

		g1.greet("Shilpa");
	}
}













