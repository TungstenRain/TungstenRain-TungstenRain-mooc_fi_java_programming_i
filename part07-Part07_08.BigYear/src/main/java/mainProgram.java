
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // Instantiate Classes
        Scanner scanner = new Scanner(System.in);
        BirdList birdList = new BirdList();
        UserInterface userInterface = new UserInterface(scanner, birdList);
        
        // Start the UserInterface
        userInterface.start();
    }

}
