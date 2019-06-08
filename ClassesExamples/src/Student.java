public class Student {

    String name = "Harish";

    int rollNumber = 1234;

    String studentBranch;


    public void branchName(String branch)
    {
        System.out.println("The Student's branch is "+branch);

        studentBranch = branch;
    }

    public void studentDescription()
    {
        String description = "Name of the Student: "+name
                +"\nRoll Number: "+rollNumber
                +"\nBranch: "+studentBranch;

        System.out.println(description);

    }

}


class NextStudent{

   protected void nextMethod()
    {
        System.out.println("This is the next method");
    }
}