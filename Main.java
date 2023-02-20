import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // declare variables
        int sideOne = 0;
        int sideTwo = 0;
        int diagonal = 0;
        int area = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);
        // ask the sides of the rectangle
        System.out.println("What is one side of the rectangle");
        // determine if sides are correct variables
        if(in.hasNextInt())
        {
            sideOne = in.nextInt();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered an incorrect variable: " + trash);
            // ends program
            System.exit(0);
        }
        // find out other side
        System.out.println("What is the second side of the rectangle");
        // checks if it is correct variable
        if(in.hasNextInt())
        {
            // calculates area and diagonal
            sideTwo = in.nextInt();
            area = sideOne * sideTwo;
            diagonal = sideOne*sideOne + sideTwo*sideTwo;
            // prints results
            System.out.println("The area is " + area + " and the diagonal is " + Math.sqrt(diagonal));
        }
        else
        {
            // prints the error code
            trash = in.nextLine();
            System.out.println("You entered an incorrect variable: " + trash);
        }
    }
}