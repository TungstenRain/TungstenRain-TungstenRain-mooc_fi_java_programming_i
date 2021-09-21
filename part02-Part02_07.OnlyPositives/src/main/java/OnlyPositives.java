
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Begin loop to capture number
        /**
         * If the number is negative (smaller than zero), the program prints for
         * user "Unsuitable number" and asks the user for a new number.
         * If the number is zero, the program exits the loop.
         * If the number is positive, the program prints the number
         * to the power of two.
         */
        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            if (value == 0) {
                break;
            }
            if (value < 0) {
                System.out.println("Unsuitable number");
                continue;
            }
            System.out.println(Math.pow((double)value, 2));
        }
    }
}
