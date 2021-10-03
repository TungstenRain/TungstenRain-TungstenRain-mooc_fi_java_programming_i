
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        // Instantiate Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Request and capture user input
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        // Instantiate Scanner to read through file
        try (Scanner reader = new Scanner(Paths.get(file))) {
            // Read and print the contents of the file
            while (reader.hasNextLine()) {
                // Initialize variable with the line content
                String line = reader.nextLine();
                
                if (line.isEmpty()) {
                    continue;
                }
                
                // Parse through input
                String[] lineContents = line.split(",");
                String name = lineContents[0];
                int age = Integer.parseInt(lineContents[1]);
                
                // Display results to user
                if (age > 1 || age == 0) {
                    System.out.println(name + ", age: " + age + " years");
                } else {
                    System.out.println(name + ", age: " + age + " year");
                }
                
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
