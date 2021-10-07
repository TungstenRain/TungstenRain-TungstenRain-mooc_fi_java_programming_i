/**
 * UserInterface Class for Part07_06
 * @author frank
 */
import java.util.Scanner;

public class UserInterface {
    // Variables
    private Scanner scanner;
    private GradeList gradeList;
    
    // Constructors
    /**
     * Construct the UserInterface
     * @param scanner Scanner: the Scanner
     * @param gradeList GradeList: the GradeList
     */
    public UserInterface(Scanner scanner, GradeList gradeList) {
        this.scanner = scanner;
        this.gradeList = gradeList;
    }
    
    // Methods
    /**
     * Start the UserInterface operation
     */
    public void start() {
        // Request and capture user input
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            
            processInput(input);
        }
        displayResults();
    }
    
    /**
     * Process the input given by the user
     * @param input int: the user's input
     */
    private void processInput(int input) {
        gradeList.add(input);
    }
    
    /**
     * Display the results of the input to the user
     */
    private void displayResults() {
        System.out.println("Point average (all): " + gradeList.averageOfAllScores());
        System.out.println("Point average (passing): " + gradeList.valueOfAverageOfPassingScores());
        System.out.println("Pass percentage: " + gradeList.passPercentage());
        gradeList.printGradeDistribution();
    }
}
