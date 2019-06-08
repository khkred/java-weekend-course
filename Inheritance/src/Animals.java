public class Animals {

    //this.name
    private String name;

    //this.brain
    private int brain;

    //this.body
    private int body;

    private int weight;

    public Animals(String name, int brain, int body, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.weight = weight;
    }

    public void eat()
    {
        System.out.println("Calling Animals.eat() method");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
