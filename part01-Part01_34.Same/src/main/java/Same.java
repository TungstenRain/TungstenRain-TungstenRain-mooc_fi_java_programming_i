
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Request and capture user information
        System.out.println("Enter the first string:");
        String first = scan.nextLine();
        System.out.println("Enter the second string:");
        String second = scan.nextLine();
        
        // Compare and print result
        if (first.equals(second)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
