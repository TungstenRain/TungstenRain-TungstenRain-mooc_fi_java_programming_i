
import java.util.Scanner;

/**
 * Part 1: Write a program which prints the integers from 1 to a number given 
 * by the user.
 * 
 * Part 2: Ask the user for the starting point as well.
 * 
 * @author frank
 */
public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request and capture user input
        System.out.println("Where to? ");
        int valueTo = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from? ");
        int valueFrom = Integer.valueOf(scanner.nextLine());
        
        for (int i = valueFrom; i <= valueTo; i++) {
            System.out.println(i);
        }
    }
}
