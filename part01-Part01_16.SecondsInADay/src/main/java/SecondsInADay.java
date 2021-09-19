
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request and capture information from user
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());
        
        // Calculate seconds in a day (There are 86400 seconds in a day)
        int sum = days * 86400;
        
        // Display result
        System.out.println(sum);

    }
}
