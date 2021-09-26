import java.util.Scanner;

/**
 * Program reads strings from the user. If the input is empty, the program 
 * stops reading input and halts. For each non-empty input it splits the string 
 * input by whitespaces and prints each part of the string on a new line.
 * 
 * @author frank
 */
public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Request and capture user information
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("") || text.isEmpty()) {
                break;
            }
            // Split text by whitespace
            String[] words = text.split(" ");
            
            // Display each word on a new line
            for (String word : words) {
                System.out.println(word);
            }
        }

    }
}
