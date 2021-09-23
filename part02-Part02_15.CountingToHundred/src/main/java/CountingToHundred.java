
import java.util.Scanner;

/**
 * Write a program, which reads an integer from the user. Then the program 
 * prints numbers from that number to 100. You can assume that the user always 
 * gives a number less than 100. Below are some examples of the expected 
 * functionality.
 * 
 * @author frank
 */
public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        int value = Integer.valueOf(scanner.nextLine());
        
        // Loop through to 100
        for (int i = value; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
