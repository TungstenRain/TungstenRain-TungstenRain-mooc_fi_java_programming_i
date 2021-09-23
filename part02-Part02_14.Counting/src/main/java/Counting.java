
import java.util.Scanner;

/**
 * Write a program that reads an integer from the user. Next, the program prints
 * numbers from 0 to the number given by the user. You can assume that the user 
 * always gives a positive number. Below are some examples of the expected 
 * functionality.
 * 
 * @author frank
 */

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        int value = Integer.valueOf(scanner.nextLine());
        
        for (int i = 0; i <= value; i++) {
            System.out.println(i);
        }
    }
}
