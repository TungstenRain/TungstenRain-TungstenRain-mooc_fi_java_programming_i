
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Capture user input
        String message = scanner.nextLine();
        
        // Print the user's message three times
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
    }
}
