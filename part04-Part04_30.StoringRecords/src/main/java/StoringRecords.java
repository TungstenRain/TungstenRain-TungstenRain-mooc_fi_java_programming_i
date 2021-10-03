
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        // Instantiate the Scanner
        Scanner scan = new Scanner(System.in);

        // Request and capture user input
        System.out.println("Filename:");
        String file = scan.nextLine();

        // Read the records and story into an ArrayList of the Person Class by calling the method readRecordsFromFile
        ArrayList<Person> records = readRecordsFromFile(file);
        
        // Display results to user
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    /**
     * Read a file to get an ArrayList of the Person class
     * @param file String: the file name to read
     * @return ArrayList<Person>: an ArrayList of the Person class
     */
    public static ArrayList<Person> readRecordsFromFile(String file) {
        // Instantiate the ArrayList of the Person Class
        ArrayList<Person> persons = new ArrayList<>();
        
        // Instantiate Scanner to read through file
        try (Scanner reader = new Scanner(Paths.get(file))) {
            // Read and parse through each line
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                
                if (line.isEmpty()) {
                    continue;
                }
                
                // Split the name and age
                String[] lineContents = line.split(",");
                String name = lineContents[0];
                int age = Integer.parseInt(lineContents[1]);
                
                // Instantiate new Person with the name and age
                persons.add(new Person(name, age));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return persons;
    }
}
