import java.util.Scanner;

/**
 * Program reads user input until an empty line is entered. For each non-empty 
 * line the program splits the string by spaces and prints the first part of 
 * the string.
 * 
 * @author frank
 */
public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Capture user input
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("") || text.isEmpty()) {
                break;
            }
            
            // Split input by whitespace
            String[] words = text.split(" ");
            System.out.println(words[0]);
        }

    }
}
