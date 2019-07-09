public class Main {

    public static void main(String[] args) {

        SampleClass sampleClass = new SampleClass();

        // WE want to print the value in default number;

        System.out.println("The value of the default number is: " + sampleClass.defaultNumber);

        sampleClass.greeting();

        //Public variables and methods can be accessed as long as we create object for the class

        System.out.println("The public number is: " + sampleClass.publicNumber);

        //Protected variables and methods can be accessed in the same package and in inherited classes

        System.out.println("The protected number is: " + sampleClass.protectedNumber);

        //Private variables and methods can be accessed only inside the class

        sampleClass.anotherProtectedGreeting();
    }
}
