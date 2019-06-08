public class Box {

    int length, breadth, height;

    /*
    For every box created we want the initial dimensions to be 1x 1 x 1
     */

    /*
    Constructor with no parameters
     */

    public Box() {

        length = 1;
        breadth = 1;
        height = 1;
    }

    /*
    The following method is going to be an example of "method overloading"
    it is also an example of Constructors with parameters
    It is also an example of Constructor overloading
     */

    public Box(int length, int breadth, int height) {
        this.length = length;

        this.breadth = breadth;

        this.height = height;
    }


}
