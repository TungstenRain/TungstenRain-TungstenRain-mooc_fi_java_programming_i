
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Request and capture user number
        System.out.println("Give a year:");
        int value = Integer.valueOf(scan.nextLine());
        
        // If value is smaller than 2015, print "Ancient history!"; otherwise, nothing.
        if (value < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
