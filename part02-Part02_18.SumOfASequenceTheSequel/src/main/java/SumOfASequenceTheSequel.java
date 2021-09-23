
import java.util.Scanner;

/**
 * Implement a program which calculates the sum of a closed interval, and 
 * prints it. Expect the user to write the smaller number first and then the 
 * larger number.
 * 
 * @author frank
 */
public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request and capture user information
        System.out.println("First number? ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number? ");
        int last = Integer.valueOf(scanner.nextLine());
        
        // Initialize variables
        int i = first;
        int sum = 0;
        
        // Sum numbers
        while (i <= last) {
            sum += i;
            i++;
        }
        
        // Display results
        System.out.println("The sum is: " + sum);
    }
}
