public class GoldenRetriever extends Dogs {

    private int age;

    public GoldenRetriever(String name, int weight, int age) {
        super(name, weight, 2, 4, 1, "Golden Retriever");

        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void eat() {
        super.eat();
    }
}
