
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program that reads inputs from the user and adds them to a list. 
 * Reading is stopped once the user enters an empty string.
 * 
 * Print the last read value after it stops reading. 
 * 
 * @author frank
 */
public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate arraylist
        ArrayList<String> list = new ArrayList<>();
        
        // Capture user input
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        // Display last in list
        System.out.println(list.get(list.size() - 1));
    }
}
