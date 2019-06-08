public class Dogs extends Animals{

    private int eyes;

    private int legs;

    private int tail;

    private String breed;

    public Dogs(String name, int weight, int eyes, int legs, int tail, String breed)
    {
        super(name, 1, 1, weight);

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.breed = breed;




    }

    @Override
    public void eat() {


        System.out.println("Callings the Dogs.eat() method");
        chew();
        

    }

    public void chew()
    {
        System.out.println("All Dogs chew, Dogs.chew() method");
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public String getBreed() {
        return breed;
    }
}
