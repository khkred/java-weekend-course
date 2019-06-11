public class Main {

    public static void main(String[] args) {

        FindArea findArea = new FindArea();

        double circleArea = findArea.area(7);

        System.out.println("The area of the circle is "+ circleArea);

        int rectangleArea = findArea.area(20,10);

        System.out.println("The Area of rectangle is "+rectangleArea);

    }
}
