/**
 *
 * @author frank
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeFile {
    // Methods
    /**
     * Get the recipes from the given file
     * @param fileName String: the file name
     * @return RecipeList: a list of all the recipes in the file
     */
    public static RecipeList getRecipes(String fileName) {
        // Instantiate ArrayLists
        RecipeList recipes = new RecipeList();
        ArrayList<String> recipeComponents = new ArrayList<>();
        
        // Process file
        try(Scanner scanner = new Scanner(Paths.get(fileName))) {
           
            while (scanner.hasNextLine()) {
                // Capture information from file
                String row = scanner.nextLine();
                if (!row.isEmpty()) {
                    recipeComponents.add(row);
                } else {
                    Recipe recipe = makeRecipe(recipeComponents);
                    recipes.add(recipe);
                }
            }
            if (!recipeComponents.isEmpty()) {
                Recipe recipe = makeRecipe(recipeComponents);
                recipes.add(recipe);
            }
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
        
        return recipes;
    }
    
    /**
     * Make a Recipe from the components
     * @param components ArrayList<String>: the ArrayList of the components of a recipe
     * @return Recipe: the recipe
     */
    private static Recipe makeRecipe(ArrayList<String> components) {
        String name = components.get(0);
        components.remove(0);
        int cookingTime = Integer.valueOf(components.get(0));
        components.remove(0);
        
        // Instantiate Recipe and clear components
        Recipe recipe = new Recipe(name, cookingTime, components);
        components.clear();
        
        return recipe;
    }
}
