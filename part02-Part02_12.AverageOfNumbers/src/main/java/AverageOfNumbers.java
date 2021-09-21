
import java.util.Scanner;

/**
 * Write a program that asks the user for input until the user inputs 0. 
 * After this, the program prints the average of the numbers. The number zero 
 * does not need to be counted to the average. You may assume that the user 
 * inputs at least one number.
 * 
 * The average of the numbers can be calculated by dividing the sum of numbers
 * with the amount of the numbers
 * 
 * @author frank
 */
public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize variables
        int count = 0;
        int sum = 0;
        
        // Begin Loop
        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            
            // If value = 0, exit
            if (value == 0) {
                break;
            }
            count += 1;
            sum += value;
        }
        
        // Calculate average
        double average = (double) sum / count;
        
        // Display results
        System.out.println("Average of the numbers: " + average);
    }
}
