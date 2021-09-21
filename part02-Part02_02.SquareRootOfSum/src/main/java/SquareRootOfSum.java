
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /**
         * NOTE: Not stating what information you request from user for user input
         * is a bad programming habit.
         */
        // Capture input from user
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        
        // Calculate and display the square root of the sum of these integers
        System.out.println(Math.sqrt((double)first + second));

    }
}
