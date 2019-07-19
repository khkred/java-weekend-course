public class Main {

    public static void main(String[] args) {

        BMW myBMW = new BMW();

        myBMW.currentSpeed = 60;

        myBMW.accelerate();

        myBMW.brake();

        myBMW.noOfGears = 7;

        System.out.println("the number of gears in our car are: "+myBMW.noOfGears);


    }
}
