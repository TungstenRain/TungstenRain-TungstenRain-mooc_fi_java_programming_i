
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Request and capture user input
        System.out.println("Give a number:");
        int value = Integer.valueOf(scan.nextLine());
        
        // If value = 1984 print "Orwell"; otherwise, nothing.
        if (value == 1984) {
            System.out.println("Orwell");
        }
    }
}
