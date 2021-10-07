/**
 * TextUI Class for Part06_09
 * @author frank
 */
import java.util.Scanner;

public class TextUI {
    // Variables
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    // Constructors
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    // Methods
    public void start() {
        this.requestInformation();
    }
    
    /**
     * Request and capture user information
     */    
    private void requestInformation() {
        // Request and capture user input
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            this.processCommand(command);
        }
    }
    
    private void processCommand(String command) {
        // Switch statements for commands
        switch (command) {
            case "add":
                this.add();
                break;
            case "search":
                this.search();
                break;
            default:
                System.out.println("Unknown command");
                break;
        }
    }
    
    /**
     * Request a word and its translation and add it to the SimpleDictionary
     */
    private void add() {
        // Request and capture user input
        System.out.println("Word:");
        String word = scanner.nextLine();
        System.out.println("Translation:");
        String translation = scanner.nextLine();
        
        // Store input into the SimpleDictionary
        dictionary.add(word, translation);
    }
    
    /**
     * Request a word from the user and print the translation
     */
    private void search() {
        // Request and capture user input
        System.out.println("To be translated:");
        String word = scanner.nextLine();
        
        if (word.isEmpty()) {
            return;
        }
        
        // Retrieve word from dictionary and display result
        String translation = dictionary.translate(word);
        if (translation == null) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + translation);
        }
    }
}
