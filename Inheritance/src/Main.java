public class Main {

    public static void main(String[] args) {

        //Creating an object for Animals Class

        Animals animals = new Animals("Gerome",1,1,30);

        int animalWeight = animals.getWeight();


        //Creating an object for the "Dogs" Class.

        Dogs dog = new Dogs("Timmy",25,2,4,1,"German Shepherd");

        String breed = dog.getBreed();

        String dogName = dog.getName();

//        System.out.println("The name of the dog is: "+dogName+"\n" +
//                "The breed of the dog is: "+breed);
//
//        dog.eat();

        GoldenRetriever goldenRetriever = new GoldenRetriever("Robert",23,2);

        int dogsAge = goldenRetriever.getAge();


//        System.out.println("The Dogs Age is "+dogsAge);

        Animals g1 = new GoldenRetriever("Hitman",24,3);

        g1.eat();






    }
}
