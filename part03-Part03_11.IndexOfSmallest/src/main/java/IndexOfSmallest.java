
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program reads numbers from the user. When number 9999 is entered, the 
 * reading process stops. After this the program will print the smallest number 
 * in the list, and also the indices where that number is found. 
 * Notice: the smallest number can appear multiple times in the list.
 * 
 * @author frank
 */
public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Instantiate ArrayLists
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> indeces = new ArrayList<>();

        // implement here a program that reads user input
        // until the user enters 9999
        
        // Capture user input
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            if (value == 9999) {
                break;
            }
            
            list.add(value);
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        // Initialize variable
        int min = 999999999;
        
        // Identify the smallest number and capture its index value
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
                
                // Clear list and add new index to array
                indeces.clear();
                indeces.add(i);
            } else if (list.get(i) == min) {
                indeces.add(i);
            }
        }
        
        // Display results to the user
        System.out.println("Smallest number: " + min);
        for (int index : indeces) {
            System.out.println("Found at index: " + index);
        }
        
    }
}
