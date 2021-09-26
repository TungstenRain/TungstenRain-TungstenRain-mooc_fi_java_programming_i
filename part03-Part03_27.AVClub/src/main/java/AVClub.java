import java.util.Scanner;

/**
 * Program reads user input until an empty line. For each non-empty string, the 
 * program splits the string by spaces and then prints the pieces that contain 
 * av, each on a new line.
 * 
 * @author frank
 */
public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request and capture user input
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("") || text.isEmpty()) {
                break;
            }
            
            // Split the text into words based on whitespace
            String[] words = text.split(" ");
            
            // Print each word that contains "av"
            for (String word : words) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
            
        }

    }
}
