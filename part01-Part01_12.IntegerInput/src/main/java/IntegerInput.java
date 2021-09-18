
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request user input
        System.out.println("Give a number:");
        
        // Capture user input
        int value = Integer.valueOf(scanner.nextLine());
        
        // Print result
        System.out.println("You gave the number " + value);
    }
}
