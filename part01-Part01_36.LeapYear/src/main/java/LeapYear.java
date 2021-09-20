
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Request and capture year from user
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        
        // Determine if given year is a leap year
        // A leap year is divisible by 4 and 400
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 ))  {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
