public class Main {

    public static void main(String[] args) {

        Box box  = new Box();

        System.out.println("The length of the box is: "+box.length);

        Box box1 = new Box(5,7,6);

        System.out.println("The breadth of the box1 is: "+box1.breadth);
    }
}
