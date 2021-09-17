
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Request user input
        String message = scanner.nextLine();
        
        // Print user input
        System.out.println(message);
    }
}
