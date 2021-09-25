
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program reads numbers from the user and adds them to a list. 
 * Reading is stopped once the user enters the number -1.
 * 
 * Ask the user for a number, and report that number's index in the list.
 * If the number is not found, the program should not print anything.
 * 
 * @author frank
 */
public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate ArrayLists
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> indeces = new ArrayList<>();
        
        // Capture user input
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // Request and capture user input
        System.out.println("Search for? ");
        int number = Integer.valueOf(scanner.nextLine());
        
        // Search for number in array and capture it's index value
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == number) {
                indeces.add(i);
            }
        }
        
        // Display results
        for (int index : indeces) {
            System.out.println(number + " is at index " + index);
        }
        
    }
}
