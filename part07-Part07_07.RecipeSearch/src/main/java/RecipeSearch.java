import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        // Instantiate Classes
        Scanner scanner = new Scanner(System.in);
        RecipeList recipes = new RecipeList();
        UserInterface userInterface = new UserInterface(scanner, recipes);
        
        // Start the program
        userInterface.start();
    }

}
