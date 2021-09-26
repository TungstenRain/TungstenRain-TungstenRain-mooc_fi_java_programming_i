
import java.util.Scanner;

/**
 * Program reads user input until an empty line is entered. For each non-empty 
 * line the program splits the string by spaces and prints the last part of the 
 * string.
 * 
 * @author frank
 */
public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Capture user information
        while (true) {
            String text = scanner.nextLine();
            if (text.isEmpty() || text.equals("")) {
                break;
            }
            
            // Split the text by whitespace
            String[] words = text.split(" ");
            
            // Print the last word
            System.out.println(words[words.length - 1]);
        }

    }
}
