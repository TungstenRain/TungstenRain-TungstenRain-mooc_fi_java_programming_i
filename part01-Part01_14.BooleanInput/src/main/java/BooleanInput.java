
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request user input
        System.out.println("Write something:");
        
        // Capture user input
        Boolean value = Boolean.valueOf(scanner.nextLine());
        
        // Display result
        System.out.println("True or false? " + value);
    }
}
