
import java.util.Scanner;

/**
 * Implement a program which calculates the factorial of a number given by the 
 * user.
 * 
 * Factorial of n, denoted n!, is calculated as 1 * 2 * 3 * ... * n. 
 * For example, the factorial of 4 is 24 or 4! = 1 * 2 * 3 * 4 = 24. 
 * Additionally, it has been specified that the factorial of 0 is 1, so 0! = 1.
 * 
 * @author frank
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request and capture user information
        System.out.println("Give a number: ");
        int value = Integer.valueOf(scanner.nextLine());
        
        // Initialize variable
        int factorial = 1;
        
        // Calculate factorial
        for (int i = 1; i <= value; i++) {
            factorial *= i;
        }
        
        // Display results
        System.out.println("Factorial: " + factorial);
    }
}
