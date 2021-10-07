/**
 * UserInterface Class for Part07_07
 * @author frank
 */
import java.util.Scanner;

public class UserInterface {
    // Variables
    private Scanner scanner;
    private RecipeList recipes;
        
    // Constructors
    public UserInterface(Scanner scanner, RecipeList recipes) {
        this.scanner = scanner;
        this.recipes = recipes;
    }
    
    // Methods
    /**
     * Start the UserInterface
     */
    public void start() {
        // Initialize variable
        String fileName = requestFileName();
        System.out.println("");
        
        if (fileName.isEmpty()) {
            return;
        }
        
        // Get recipies from the file
        getRecipies(fileName);
        
        // Request user input
        requestInput();
    }
    
    /**
     * Request the recipe file name
     * @return String: the file name
     */
    private String requestFileName() {
        System.out.println("File to read: ");
        return scanner.nextLine();
    }
    
    /**
     * Get the recipes from the file name
     * @param fileName String: the recipe file name
     */
    private void getRecipies(String fileName) {
        this.recipes = RecipeFile.getRecipes(fileName);
    }
    
    /**
     * Request user input
     */
    private void requestInput() {
        // Display commands to user
        displayCommands();
        
        // Request commands from user and process input
        while (true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine().toLowerCase();
            System.out.println("");
            
            if (command.equals("stop")) {
                break;
            }
            
            processCommand(command);
        }
    }
    
    /**
     * Display commands user can implement
     */
    private void displayCommands() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
    }
    
    /**
     * Process commands given by the user
     * @param command String: the command
     */
    private void processCommand(String command) {
        switch (command) {
            case "list":
                listAllRecipes();
                break;
            case "find name":
                findRecipeByName();
                break;
            case "find cooking time":
                findRecipeByCookingTime();
                break;
            case "find ingredient":
                findRecipeByIngredient();
                break;
            case "command":
                displayCommands();
                break;
            default:
                break;
        }
    }
    
    /**
     * List all the recipes in the recipe list
     */
    private void listAllRecipes() {
        recipes.listAllRecipes();
    }
    
    /**
     * Request a search word and find the recipe matching that name
     */
    private void findRecipeByName() {
        // Request search word from user
        System.out.println("Searched word: ");
        String word = scanner.nextLine();
        System.out.println("");
        
        if (word.isEmpty()) {
            return;
        }
        
        recipes.findRecipeByName(word);
    }
    
    /**
     * Request a maximum cooking time and find recipes that are equal to or less than the given time
     */
    private void findRecipeByCookingTime() {
        // Request cooking time from user
        System.out.println("Max cooking time: ");
        int maxCookingTime = Integer.valueOf(scanner.nextLine());
        System.out.println("");
        
        if (maxCookingTime < 0) {
            return;
        }
        
        recipes.findRecipeByMaxCookingTime(maxCookingTime);
    }
    
    /**
     * Request an ingredient and find all recipes with that ingredient
     */
    private void findRecipeByIngredient() {
        // Request ingredient from user
        System.out.println("Ingredient: ");
        String ingredient = scanner.nextLine();
        System.out.println("");
        
        if (ingredient.isEmpty()) {
            return;
        }
        
        recipes.findRecipeByIngredient(ingredient);
    }
}