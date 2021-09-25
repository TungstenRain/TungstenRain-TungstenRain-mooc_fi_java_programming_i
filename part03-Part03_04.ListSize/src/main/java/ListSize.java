import java.util.ArrayList;
import java.util.Scanner;

/**
 * The program reads input from the user. When it quits reading, the program 
 * prints the number of values on the list.
 * 
 * @author frank
 */
public class ListSize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize arraylist
        ArrayList<String> list = new ArrayList<>();
        
        // Capture user input
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        // Display results
        System.out.println("In total: " + list.size());

    }
}
