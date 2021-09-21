
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * NOTE: The example used in the instruction because it does not inform
         * the user what is needed. This is bad programming habit.
         */
        
        // Capture integer from user
        int number = Integer.valueOf(scanner.nextLine());
        
        // Square the number
        int square = number * number;
        
        System.out.println(square);
    }
}
