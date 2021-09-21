
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * NOTE: Not stating what information you request from user for user input
         * is a bad programming habit.
         */
        // Capture input from user
        int value = Integer.valueOf(scanner.nextLine());
        
        // Print the absolute value of the user input
        System.out.println(Math.abs(value));
    }
}
