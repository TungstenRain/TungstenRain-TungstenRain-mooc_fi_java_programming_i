
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        // Instantiate Scanner
        Scanner scanner = new Scanner(System.in);

        // Request and capture user input
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        // Read contents of file
        try (Scanner reader = new Scanner(Paths.get(file))) {
            // Instantiate ArrayList then read and store contents of file into it
            ArrayList<String> list = new ArrayList<>();
            while (reader.hasNextLine()) {
                list.add(reader.nextLine());
            }
            
            // Request and capture user input
            System.out.println("Search for:");
            String searchFor = scanner.nextLine();
            
            // Determine if user input is in file
            if (list.contains(searchFor)) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
