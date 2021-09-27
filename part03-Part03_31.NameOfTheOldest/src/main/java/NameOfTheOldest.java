import java.util.Scanner;

/**
 * Program reads names and ages from the user until an empty line is entered. 
 * The name and age are separated by a comma.
 * 
 * After reading all user input, the program prints the name of the oldest 
 * person. You can assume that the user enters at least one person, and the 
 * that one of the users is older than the others.
 * 
 * @author frank
 */
public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int maxAge = 0;
        String name = "";
        
        // Capture user input
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty() || input.equals("")) {
                break;
            }
            
            // Split input by comma and get age
            String[] nameAge = input.split(",");
            int age = Integer.valueOf(nameAge[1]);
            // Check for max age
            if (age > maxAge) {
                maxAge = age;
                name = nameAge[0];
            }
        }
        
        // Display name of the oldest
        System.out.println("Name of the oldest: " + name);

    }
}
