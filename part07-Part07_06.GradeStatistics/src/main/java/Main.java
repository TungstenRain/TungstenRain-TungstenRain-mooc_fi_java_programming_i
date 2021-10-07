
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Instantiate classes
        Scanner scanner = new Scanner(System.in);
        GradeList gradeList = new GradeList();
        UserInterface userInterface = new UserInterface(scanner, gradeList);
        
        // Start the program
        userInterface.start();
    }
}
