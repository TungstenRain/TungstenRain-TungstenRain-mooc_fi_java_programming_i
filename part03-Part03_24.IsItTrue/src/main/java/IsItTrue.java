
import java.util.Scanner;

/**
 * Program asks the user for a string. If the user writes the string "true", the 
 * program prints "You got it right!", otherwise it prints "Try again!".
 * 
 * @author frank
 */
public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Request and capture user information
        System.out.println("Give a string: ");
        String value = scanner.nextLine();
        
        // Compare user input to "true" and display results
        if (value.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
