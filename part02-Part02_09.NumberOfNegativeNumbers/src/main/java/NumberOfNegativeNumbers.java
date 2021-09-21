
import java.util.Scanner;

/**
 * Write a program that reads values from the user until they input a 0. 
 * After this, the program prints the total number of inputted values that are
 * negative.
 * The zero that's used to exit the loop should not be included
 * in the total number count.
 * @author frank
 */
public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variable
        int count = 0;
        
        // Begin Loop
        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            
            // If value = 0, exit
            if (value == 0) {
                break;
            }
            
            // If value is negative, count
            if (value < 0) {
                count += 1;
            }
        }
        
        // Display results
        System.out.println("Number of negative numbers: " + count);
    }
}
