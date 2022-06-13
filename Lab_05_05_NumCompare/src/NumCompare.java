public class NumCompare {
    public static void main(String[] args)
    {
        double numOne = 7;
        double numTwo = 7;

        if (numOne > numTwo)
        {
            System.out.println("Number two is smaller than number one.");
        } else if (numTwo > numOne)
        {
            System.out.println("Number one is smaller than number two.");
        }
        else if (numTwo == numOne)
        {
            System.out.println("The two numbers are equal.");
        }
        else
        {
            System.out.println("Invalid input. Please try again.");
        }



    }
}
