public class SampleClass {

    public int publicNumber = 5;
    protected int protectedNumber = 20;
    int defaultNumber = 10;
    private int privateNumber = 7;

    void greeting() {
        System.out.println("This is a public method");
    }

    private void anothergreeting() {
        System.out.println("This is a private method");
    }

    protected void anotherProtectedGreeting() {
        System.out.println("This is a protected method");
    }
}
