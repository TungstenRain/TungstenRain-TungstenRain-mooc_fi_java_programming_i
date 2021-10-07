/**
 * UserInterface for Part07_08
 * @author frank
 */
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    // Variables
    private Scanner scanner;
    private BirdList birdList;
    
    // Constructors
    /**
     * Construct the UserInterface
     * @param scanner Scanner: the Scanner
     * @param birdList BirdList: the BirdList
     */
    public UserInterface(Scanner scanner, BirdList birdList) {
        this.scanner = scanner;
        this.birdList = birdList;
    }
    
    // Methods
    /**
     * Start the UserInterface
     */
    public void start() {
        while(true) {
            // Request and capture user input
            System.out.println("?");
            String input = scanner.nextLine().toLowerCase();
            
            if (input.equals("quit")) {
                break;
            }
            
            processCommand(input);
        }
    }
    
    /**
     * Process command given by user
     * @param command String: the command
     */
    private void processCommand(String command) {
        switch (command) {
            case "add":
                add();
                break;
            case "observation":
                observation();
                break;
            case "all":
                all();
                break;
            case "one":
                one();
                break;
            default:
                break;
        }
    }
    
    /**
     * Add a bird to the list
     */
    private void add() {
        // Request and capture input
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Name in Latin: ");
        String latinName = scanner.nextLine();
        
        this.birdList.addBird(name, latinName);
    }
    
    /**
     * Record an observation of a particular bird
     */
    private void observation() {
        // Request and capture input
        System.out.println("Bird?");
        String name = scanner.nextLine();
        
        this.birdList.addObservation(name);
    }
    
    /**
     * Print all the birds in the list
     */
    private void all() {
        this.birdList.printAll();
    }
    
    /**
     * Print a given bird
     */
    private void one() {
        // Request and capture input
        System.out.println("Bird?");
        String name = scanner.nextLine();
        
        this.birdList.printBird(name);
    }
}