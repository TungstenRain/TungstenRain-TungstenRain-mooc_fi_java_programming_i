
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request and capture the first number
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        
        // Request and capture the second number
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        // Request and capture the third number
        System.out.println("Give the third number:");
        int third = Integer.valueOf(scanner.nextLine());
        
        // Calculate the sum
        int sum = first + second + third;
        
        // Display the result
        System.out.println("The sum of the numbers is " + sum);

    }
}
