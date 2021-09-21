
import java.util.Scanner;

/**
 * Write a program that reads numbers from the user until the user 
 * inputs a number 0. After this the program outputs the sum of the numbers. 
 * The number zero does not need to be added to the sum, even if it does not 
 * change the results.
 * @author frank
 */
public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize variable
        int sum = 0;
        
        // Begin Loop
        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            
            // if value = 0, exit
            if (value == 0) {
                break;
            }
            
            // Sum all the values
            sum += value;
        }
        
        // Display results
        System.out.println("Sum of the numbers: " + sum);
    }
}
