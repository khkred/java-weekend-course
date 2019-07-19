public class Triangle {

    int length;
    int breadth;
    int height;

    int someVariable;

    public Triangle(int tempLength,int tempBreadth,int tempHeight)
    {
        length = tempLength;

        breadth = tempBreadth;

        height = tempHeight;


    }



    public void area()
    {
        int triangleArea = length*breadth*height;

        System.out.println("The area of the triangle is: "+triangleArea);



    }




}
