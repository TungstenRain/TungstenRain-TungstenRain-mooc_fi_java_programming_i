
import java.util.Scanner;

/**
 * Program reads names and ages from the user until an empty line is entered. 
 * The name and age are separated by a comma.
 * 
 * After reading all user input, the program prints the age of the oldest 
 * person. You can assume that the user enters at least one person, and that one 
 * of the users is older than the others.
 * 
 * @author frank
 */
public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variable
        int maxAge = 0;
        
        // Capture user information
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty() || input.equals("")) {
                break;
            }
            
            // Split input on comma
            String[] nameAge = input.split(",");
            
            // Determin max age            
            int age = Integer.valueOf(nameAge[1]);
            if (age > maxAge) {
                maxAge = age;
            }
        }

        // Display the oldest age
        System.out.println("Age of the oldest: " + maxAge);
    }
}
