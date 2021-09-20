
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Request and capture user input
        System.out.println("Password?");
        String userPW = scan.nextLine();
        
        // Initialize variable
        String password = "Caput Draconis";
        
        // Compare user input to password and provide response
        if (password.equals(userPW)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
