
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program reads numbers from the user and adds them to a list. 
 * Reading is stopped once the user enters the number -1.
 * 
 * Find the greatest number in the list and print its value after reading all 
 * the numbers. The programming should work in the following manner.
 * 
 * @author frank
 */
public class GreatestInList {

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
        
        System.out.println("");

        // Initialize variable
        int max = 0;
        // Identify the greatest number
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        
        // Display the result
        System.out.println("The greatest number: " + max);
   }
}
