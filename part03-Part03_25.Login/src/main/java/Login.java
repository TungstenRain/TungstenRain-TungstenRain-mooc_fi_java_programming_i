import java.util.Scanner;

/**
 * A program that recognizes the following users and passwords
 * user: alex; pw: sunshine
 * user: emma; pw: haskell
 * 
 * The program either shows a personal message or informs of an incorrect 
 * username or password.
 * 
 * @author frank
 */
public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Request and capture user information:
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if ((username.equals("alex") && password.equals("sunshine")) || (username.equals("emma") && password.equals("haskell"))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
