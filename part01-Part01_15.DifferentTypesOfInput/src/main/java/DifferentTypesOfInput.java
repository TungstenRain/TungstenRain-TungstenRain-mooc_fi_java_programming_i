
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        // Instantiate the Scanner
        Scanner scan = new Scanner(System.in);

        // Request and capture string input
        System.out.println("Give a string:");
        String strValue = scan.nextLine();
        
        // Request and capture integer input
        System.out.println("Give an integer:");
        int intValue = Integer.valueOf(scan.nextLine());
        
        // Request and capture double input
        System.out.println("Give a double:");
        Double doubleValue = Double.valueOf(scan.nextLine());
        
        // Request and capture boolean input
        System.out.println("Give a boolean:");
        Boolean booleanValue = Boolean.valueOf(scan.nextLine());
        
        // Print results
        System.out.println("You gave the string " + strValue);
        System.out.println("You gave the integer " + intValue);
        System.out.println("You gave the double " + doubleValue);
        System.out.println("You gave the boolean " + booleanValue);
    }
}
