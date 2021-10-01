
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        // Instantiate class and objects
        Scanner scanner = new Scanner(System.in);
        
        // Initialize variable
        int counter = 0;
        
        // Request information from user
        while (true) {
            String word = scanner.nextLine();
            
            if (word.equals("end")) {
                break;
            }
            counter++;
        }
        
        // Display result to user
        System.out.println(counter);
    }
}
