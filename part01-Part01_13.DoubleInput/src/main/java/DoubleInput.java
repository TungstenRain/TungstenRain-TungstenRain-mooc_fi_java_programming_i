
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request user input
        System.out.println("Give a number:");
        
        // Capture user input
        Double value = Double.valueOf(scanner.nextLine());
        
        // Print result
        System.out.println("You gave the number " + value);
    }
}
