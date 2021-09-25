
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program reads numbers from the user and adds them to a list. Reading is 
 * stopped once the user enters the number -1.
 * 
 * When reading ends, calculate the average of the numbers in it, and then 
 * print that value.
 * 
 * @author frank
 */
public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Instantiate ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        
        // Capture user input
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }
            
            list.add(num);
        }
        
        // Initialize variables
        int sum = 0;
        double average = 0.0;
        
        // Calculate sum
        for (int number : list) {
            sum += number;
        }
        // Calculate average
        average = (double) sum / list.size();
        
        // Display the results
        System.out.println("Average: " + average);
    }
}
