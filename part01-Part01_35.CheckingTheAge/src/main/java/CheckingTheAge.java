
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Request and capture user input
        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.nextLine());
        
        // Determine if possible (ages between 0 and 120)
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
