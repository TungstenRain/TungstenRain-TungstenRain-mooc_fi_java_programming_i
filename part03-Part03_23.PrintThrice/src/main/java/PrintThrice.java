
import java.util.Scanner;

/**
 * Program reads a string from the user and then prints it three times.
 * @author frank
 */
public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request and capture user information
        System.out.println("Give a word: ");
        String value = scanner.nextLine();
        
        System.out.println(value + value + value);
    }
}
