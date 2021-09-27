
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program reads names and birth years from the user until an empty line is 
 * entered. The name and birth year are separated by a comma.
 * 
 * After that the program prints the longest name and the average of the birth 
 * years. If multiple names are equally longest, you can print any of them. 
 * You can assume that the user enters at least one person.
 * 
 * @author frank
 */
public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        String longestName = "";
        int sum = 0;
        int count = 0;
                
        // Capture user input
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty() || input.equals("")) {
                break;
            }
            
            // Split the string
            String[] nameAge = input.split(",");
            
            // Sum the birth years
            sum += Integer.valueOf(nameAge[1]);
            count++;
            
            // Determine longest name
            if (nameAge[0].length() > longestName.length()) {
                longestName = nameAge[0];
            }
        }
        
        // Calculate the average
        double average = (double) sum / count;
        
        // Display the results
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
