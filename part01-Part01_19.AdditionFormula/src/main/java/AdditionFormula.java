
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request and capture the first number
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        
        // Request and capture the second number
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        // Calculate the sum
        int sum = first + second;
        
        // Display the result
        System.out.println(first + " + " + second + " = " + sum);

    }
}
