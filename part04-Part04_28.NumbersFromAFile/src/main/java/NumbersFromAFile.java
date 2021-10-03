
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        // Instantiate Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Request and capture user input
        System.out.println("File?");
        String file = scanner.nextLine();
        System.out.println("Lower bound?");
        int lowerBound = Integer.parseInt(scanner.nextLine());
        System.out.println("Upper bound?");
        int upperBound = Integer.parseInt(scanner.nextLine());
        
        // Instantiate Scanner to read file
        try (Scanner reader = new Scanner(Paths.get(file))) {
            // Initialize counter
            int counter = 0;
            
            // Read through the file and count the numbers between the lower and upper bounds
            while (reader.hasNextLine()) {
                int lineNumber = Integer.parseInt(reader.nextLine());
                if (lineNumber >= lowerBound && lineNumber <= upperBound) {
                    counter++;
                }
            }
            
            // Display results to user
            System.out.println("Numbers: " + counter);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
