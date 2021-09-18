
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initiate conversation
        System.out.println("Greetings! How are you doing?");
        
        // User response 1
        String message1 = scanner.nextLine();
        
        // Continue conversation
        System.out.println("Oh, how interesting. Tell me more!");
        
        // User response 2
        String message2 = scanner.nextLine();
        
        // Terminate conversation
        System.out.println("Thanks for sharing!");
        
    }
}
