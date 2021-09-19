
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request and capture the numbers
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        // Calculate the average
        double average = ((double) first + second) / 2;
        
        // Display the average
        System.out.println("The average is " + average);
    }
}
