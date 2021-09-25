
import java.util.ArrayList;

/**
 * A program to demonstrate the return the sum of the numbers in the parameter 
 * list.
 * 
 * @author frank
 */
public class Sum {

    public static void main(String[] args) {
        // Instantiate ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Add valuse to the ArrayList
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        
        // Display the sum of the list
        System.out.println(sum(numbers));

        // Add a few more values to the ArrayList
        numbers.add(5);
        numbers.add(1);
        // Display the sum of the list
        System.out.println(sum(numbers));
    }
    
    public static int sum(ArrayList<Integer> numbers) {
        // Initialize variable
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

}
