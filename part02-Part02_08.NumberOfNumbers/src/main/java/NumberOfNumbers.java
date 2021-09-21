
import java.util.Scanner;

/**
 * Write a program that reads values from the user until they input a 0. 
 * After this, the program prints the total number of inputted values. 
 * The zero that's used to exit the loop should not be included in the 
 * total number count.
 * @author frank
 */
public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variable count
        int count = 0;
        
        // Begin Loop
        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            
            // If value is 0, exit
            if (value == 0) {
                break;
            }
            
            // Increment count variable
            count += 1;
        }
        System.out.println("Number of numbers: " + count);
    }
}
