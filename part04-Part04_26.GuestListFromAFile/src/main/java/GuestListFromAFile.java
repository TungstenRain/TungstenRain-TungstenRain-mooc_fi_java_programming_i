
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        // Instantiate Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        // implement reading the file here.
        System.out.println("");

        // Instantiate Scanner to read given file
        try (Scanner reader = new Scanner(Paths.get(file))) {
            // Store the contents of the file into an ArrayList
            ArrayList<String> list = new ArrayList<>();
            while (reader.hasNextLine()) {
                list.add(reader.nextLine());
            }
            
            // Request and capture user input
            System.out.println("Enter names, an empty line quits.");
            while (true) {
                String name = scanner.nextLine();
                if (name.isEmpty()) {
                    break;
                }
                
                // Determine if name is on the list and display result
                if (list.contains(name)) {
                    System.out.println("The name is on the list.");
                } else {
                    System.out.println("The name is not on the list.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // End program
        System.out.println("Thank you!");
    }
}
