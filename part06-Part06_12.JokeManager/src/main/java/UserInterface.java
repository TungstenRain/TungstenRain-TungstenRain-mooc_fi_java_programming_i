/**
 * UserInterface Class for Part06_12
 * @author frank
 */

import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    // Variables
    private Scanner scanner;
    private JokeManager manager;
    
    // Constructors
    /**
     * Construct the UserInterface
     * @param jokeManager JokeManager: the JokeManager
     * @param scanner Scanner: the scanner for user input
     */
    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.manager = jokeManager;
        this.scanner = scanner;
    }
        
    // Methods
    /**
     * Start the UserInterface
     */
    public void start() {
        this.readLines();
    }
    
    /**
     * Request and capture user input
     */
    private void readLines() {
        while (true) {
            // Request and capture input
            this.listCommands();
            String command = scanner.nextLine();
            
            if (command.equals("X")) {
                break;
            }
            
            this.processCommands(command);
        }
    }
    
    /**
     * Display a list of all the commands
     */
    private void listCommands() {
        System.out.println("Commands:");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
    }
    
    /**
     * Process the given command
     * @param command String: the command
     */
    private void processCommands(String command) {
        // Switch statement to process commands
        switch (command) {
            case "1":
                this.addJoke();
                break;
            case "2":
                this.drawJoke();
                break;
            case "3":
                this.listJokes();
                break;
            default:
                break;
        }
    }
    
    /**
     * Request user to input a joke and then add it to the manager
     */
    private void addJoke() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        
        if (!joke.isEmpty()) {
            manager.addJoke(joke);
        }
    }
    
    /**
     * Draw a joke from the JokeManager
     */
    private void drawJoke() {
        System.out.println("Drawing jokes:");
        System.out.println(manager.drawJoke());
    }
    
    /**
     * List all the jokes in the manager
     */
    private void listJokes() {
        System.out.println("Printing the jokes.");
        manager.printJokes();
    }
}
