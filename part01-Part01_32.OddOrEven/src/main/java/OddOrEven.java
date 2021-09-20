
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        // HINT:
        // You can find out if a number is even or odd easily using the modulo operator %
        // Try the following commands to see what they print
        // System.out.println( 1%2 );
        // System.out.println( 2%2 );
        // System.out.println( 3%2 );
        // System.out.println( 4%2 );
        // System.out.println( 5%2 );
        // System.out.println( 6%2 );
        // System.out.println( 7%2 );
        // int luku = 8
        // System.out.println( luku%2 );
        // So, by taking the modulo of a number and two you can find out if it is even or odd !
        
        // Request and capture user input
        System.out.println("Give a number:");
        int value = Integer.valueOf(scan.nextLine());
        
        // Initialize variable
        String result = "";
        
        // Determine if even or odd
        if (value % 2 == 0) {
            result = "even";
        } else {
            result = "odd";
        }
        
        // Print result
        System.out.println("Number " + value + " is " + result + ".");
    }
}
