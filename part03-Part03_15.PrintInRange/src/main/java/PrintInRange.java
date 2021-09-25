
import java.util.ArrayList;

/**
 * Print the numbers in a list within a specified range
 * 
 * @author frank
 */
public class PrintInRange {

    public static void main(String[] args) {
        // Instantiate ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Add numbers to the ArrayList
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        
        // Display numbers within range
        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);
        
        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);
    }
    
    /**
     * Print the numbers in an ArrayList within the given range
     * @param numbers ArrayList<Integer>; the ArrayList of integers
     * @param lowerLimit int; the lower limit of the range to be printed
     * @param upperLimit int; the upper limit of the range to be printed
     */
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int num : numbers) {
            if (num >= lowerLimit && num <= upperLimit) {
                System.out.println(num);
            }
        }
    }
    
}
