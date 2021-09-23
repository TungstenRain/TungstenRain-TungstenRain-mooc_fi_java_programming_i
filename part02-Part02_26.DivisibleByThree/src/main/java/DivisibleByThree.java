
import java.util.Scanner;

/**
 * Write a method 
 * public static void divisibleByThreeInRange(int beginning, int end) 
 * that prints all the numbers divisible by three in the given range. 
 * The numbers are to be printed in order from the smallest to the greatest.
 * 
 * @author frank
 */
public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Call method
        divisibleByThreeInRange(2, 10);
    }
    
    /**
     * Print numbers in range that are divisible by three
     * @param beginning int; beginning of range
     * @param end int; end of range
     */
    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}
