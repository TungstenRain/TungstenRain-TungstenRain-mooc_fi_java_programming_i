
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program reads numbers from the user and adds them to a list. 
 * Reading is stopped once the user enters the number -1.
 * 
 * After reading the numbers, it prints all the numbers received from the user.
 * The number used to indicate stopping should not be printed.
 * 
 * @author frank
 */
public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Capture user input
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }

            numbers.add(luku);
        }
        
        // Display all captured input
        for (int num : numbers) {
            System.out.println(num);
        }

    }
}
