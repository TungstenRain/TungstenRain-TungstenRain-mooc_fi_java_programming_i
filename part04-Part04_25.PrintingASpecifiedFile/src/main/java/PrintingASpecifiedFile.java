
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        // Instantiate Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Request and capture user input
        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();
        
        // Instantiate new scanner to read file
        try (Scanner reader = new Scanner(Paths.get(fileName))) {
            // read the file until all the lines have been read
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
