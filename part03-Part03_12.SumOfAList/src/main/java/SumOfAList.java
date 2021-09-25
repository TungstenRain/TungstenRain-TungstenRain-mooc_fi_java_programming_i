
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program reads numbers from the user and adds them to a list. Reading is 
 * stopped once the user enters the number -1.
 * 
 * After reading the numbers it calculates and prints the sum of the numbers in 
 * the list.
 * 
 * @author frank
 */
public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        
        // Capture user input
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        // Print a blank line
        System.out.println("");
        
        // Initialize the variable
        int sum = 0;

        // Sum the list
        for (int num : list) {
            sum += num;
        }
                
        // Display the results
        System.out.println("Sum: " + sum);
    }
}
