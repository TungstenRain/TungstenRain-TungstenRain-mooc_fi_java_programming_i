
import java.util.Scanner;

public class UserInterface {
    // Variables
    private GradeRegister register;
    private Scanner scanner;
    
    // Constructors
    /**
     * Construct the UserInterface
     * @param register GradeRegister: the grade register
     * @param scanner Scanner: the scanner input method
     */
    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }
    
    // Methods
    /**
     * Start the User Interface
     */
    public void start() {
        readPoints();
        System.out.println("");
        printGradeDistribution();
    }
    
    /**
     * Request user input to read the points
     */
    private void readPoints() {
        while (true) {
            System.out.print("Points: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            int points = Integer.valueOf(input);

            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }

            this.register.addGradeBasedOnPoints(points);
        }
    }

    /**
     * Print the grade distribution
     */
    private void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
        System.out.println("The average of points: " + register.averageOfPoints());
        System.out.println("The average of grades: " + register.averageOfGrades());
    }

    /**
     * Print out stars
     * @param stars int: the number of stars to print
     */
    private static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
