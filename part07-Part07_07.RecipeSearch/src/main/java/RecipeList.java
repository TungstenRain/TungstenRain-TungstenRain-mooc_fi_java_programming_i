/**
 * RecipeList for Part07_07
 * @author frank
 */

import java.util.ArrayList;

public class RecipeList {
    // Variables
    private ArrayList<Recipe> recipes;
    
    // Constructors
    /**
     * Construct the RecipeList
     */
    public RecipeList() {
        this.recipes = new ArrayList<>();
    }
    
    // Methods
    /**
     * Add a Recipe to the RecipeList
     * @param recipe Recipe: the recipe to add
     */
    public void add(Recipe recipe) {
        if (!recipes.contains(recipe)) {
            recipes.add(recipe);
        }
    }
    
    /**
     * List recipes from an ArrayList
     * @param recipeList ArrayList<Recipe>: the ArrayList of recipes
     */
    private void listRecipes(ArrayList<Recipe> recipeList) {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipeList) {
            System.out.println(recipe);
        }
        System.out.println("");
    }
    
    /**
     * List all recipes
     */
    public void listAllRecipes() {
        this.listRecipes(recipes);
    }
    
    /**
     * Find a recipe by a given name
     * @param name String: the recipe name
     */
    public void findRecipeByName(String name) {
        // Instantiate ArrayList
        ArrayList<Recipe> recipeList = new ArrayList<>();
        
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(name)) {
                recipeList.add(recipe);
            }
        }
        listRecipes(recipeList);
    }
    
    /**
     * Find all recipes that have a maximum cooking time less than or equal to the given time
     * @param maxCookingTime int: the maximum cooking time
     */
    public void findRecipeByMaxCookingTime(int maxCookingTime) {
        // Instantiate ArrayList
        ArrayList<Recipe> recipeList = new ArrayList<>();
        
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxCookingTime) {
                recipeList.add(recipe);
            }
        }
        listRecipes(recipeList);
    }
    
    /**
     * Find all recipes that contain the given ingredient
     * @param ingredient String: the ingredient
     */
    public void findRecipeByIngredient(String ingredient) {
        // Instantiate ArrayList
        ArrayList<Recipe> recipeList = new ArrayList<>();
        
        for (Recipe recipe : recipes) {
            for (String components : recipe.getIngredients()) {
                if (components.equals(ingredient)) {
                    recipeList.add(recipe);
                }
            }
        }
        listRecipes(recipeList);
    }
}
