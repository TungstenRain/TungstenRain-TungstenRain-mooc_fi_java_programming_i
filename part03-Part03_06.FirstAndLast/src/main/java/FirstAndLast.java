
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program reads inputs from the user and adds them to a list. 
 * Reading is stopped once the user enters an empty string.
 * 
 * Print both the first and the last values after the reading ends.
 * You may suppose that at least two values are read into the list.
 * 
 * @author frank
 */
public class FirstAndLast {

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
        
        // Display first and last in list
        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));

    }
}
