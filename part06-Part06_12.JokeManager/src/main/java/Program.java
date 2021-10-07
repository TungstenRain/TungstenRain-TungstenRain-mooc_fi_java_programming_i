import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // Instantiate the classes
        Scanner scanner = new Scanner(System.in);
        JokeManager jokeManager = new JokeManager();
        UserInterface userInterface = new UserInterface(jokeManager, scanner);
        
        // Start the UserInterface
        userInterface.start();
    }
}
