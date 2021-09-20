
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Request and capture user age
        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.nextLine());
        
        // If age >= 18, print "You are an adult"; otherwise, print "You are not an adult"
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }
    }
}
