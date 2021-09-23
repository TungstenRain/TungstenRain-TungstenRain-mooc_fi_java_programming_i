
import java.util.Scanner;

/**
 * Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.
 * 
 * @author frank
 */
public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request and capture user information
        System.out.println("Last number? ");
        int lastNumber = Integer.valueOf(scanner.nextLine());
        
        // Initialize variable
        int sum = 0;
        
        // Calculate number
        for (int i = 1; i <= lastNumber; i++) {
            sum += i;
        }
        
        // Display results
        System.out.println("The sum is " + sum);
    }
}
