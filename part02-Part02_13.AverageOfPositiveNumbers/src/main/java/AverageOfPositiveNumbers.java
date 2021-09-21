
import java.util.Scanner;

/**
 * Write a program that asks the user for input until the user inputs 0.
 * After this, the program prints the average of the positive numbers 
 * (numbers that are greater than zero).
 * 
 * If no positive number is inputted, the program prints 
 * "Cannot calculate the average"
 * 
 * @author frank
 */

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int count = 0;
        int sum = 0;
        
        // Begin loop
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            
            // if value is 0, exit
            if (value == 0) {
                break;
            }
            
            if (value > 0) {
                count += 1;
                sum += value;
            }
        }
        
        // Determine if can calculate
        if (count == 0){
            System.out.println("Cannot calculate the average");
        } else {
            // Calculate average
            double average = (double) sum / count;
            
            // Display results
            System.out.println(average);
        }
        
    }
}
