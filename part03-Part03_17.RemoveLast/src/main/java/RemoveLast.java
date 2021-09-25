
import java.util.ArrayList;

/**
 * A program to demonstrate how to remove the last value in the list it 
 * receives as a parameter. If the list is empty, the method does nothing.
 * 
 * @author frank
 */
public class RemoveLast {

    public static void main(String[] args) {
        // Instantiate ArrayList
        ArrayList<String> strings = new ArrayList<>();

        // Add values to ArrayList
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        // Display ArrayList contents
        System.out.println(strings);

        // Remove the last two values
        removeLast(strings);
        removeLast(strings);

        // Display ArrayList contents
        System.out.println(strings);
    }
    
    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
            return;
        }
        
        strings.remove(strings.size() - 1);
    }

}
