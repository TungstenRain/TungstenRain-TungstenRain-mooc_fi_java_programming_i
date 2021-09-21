
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /**
         * NOTE: Not stating what information you request from user for user input
         * is a bad programming habit.
         */
        // Capture input from user
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        
        // Determine which number is greatest
        if (first > second) {
            System.out.println(first + " is greater than " + second);
        } else if (first < second) {
            System.out.println(first + " is smaller than " + second);
        } else if (first == second) { 
            System.out.println(first + " is equal to " + second);
        }
    }
}
