
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program reads inputs from the user until an empty string is entered. After 
 * reading the inputs, one more string is requested from the user. The program 
 * then tell whether that string was found in the list or not.
 * 
 * @author frank
 */
public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate ArrayList
        ArrayList<String> list = new ArrayList<>();
        
        // Capture user input
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        // Request and capture user input
        System.out.println("Search for? ");
        String searchFor = scanner.nextLine();
        
        // Search for string and display results
        if (list.contains(searchFor)) {
            System.out.println(searchFor + " was found!");
        } else {
            System.out.println(searchFor + " was not found!");
        }

    }
}
