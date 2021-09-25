
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program reads numbers from the user and adds them to a list. 
 * Reading is stopped once the user enters the number -1.
 * 
 * Expand the program to ask for a start and end indices once it has finished 
 * asking for numbers. After this the program shall prints all the numbers in 
 * the list that fall in the specified range (between the indices given by 
 * the user, inclusive). You may assume that the user gives indices that match 
 * some numbers in the list.
 * 
 * @author frank
 */
public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Capture user input
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        
        // Request and capture user input for what range to print in the ArrayList
        System.out.println("From where? ");
        int begin = Integer.valueOf(scanner.next());
        System.out.println("To where? ");
        int end = Integer.valueOf(scanner.next());
        
        // Display range to user
        for (int i = begin; i <= end; i++) {
            System.out.println(numbers.get(i));
        }
        

    }
}
