/**
 * Recipe Class for Part 07_07
 * @author frank
 */
import java.util.ArrayList;

public class Recipe {
    // Variables
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients = new ArrayList<>();
    
    // Constructors
    /**
     * Construct the Recipe
     * @param name String: the recipe name
     * @param cookingTime int; the cooking time
     * @param ingredients ArrayList<String>: the ArrayList of ingredients
     */
    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        for (String ingredient : ingredients) {
            this.ingredients.add(ingredient);
        }
    }
        
    // Methods
    /**
     * Set the recipe name
     * @param name String: recipe name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Get the recipe name
     * @return String: the recipe name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Set the cooking time for the recipe
     * @param cookingTime int: the cooking time
     */
    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }
    
    /**
     * Get the cooking time for the recipe
     * @return int: the cooking time
     */
    public int getCookingTime() {
        return cookingTime;
    }
    
    /**
     * Set the ingredients in the recipe
     * @param ingredients ArrayList<String>: the ArrayList of ingredients
     */
    public void setIngredients(ArrayList<String> ingredients) {
        for (String ingredient : ingredients) {
            if (!this.ingredients.contains(ingredient)) {
                this.ingredients.add(ingredient);
            }
        }
    }
    
    /**
     * Add ingredients to the Recipe
     * @param ingredient String: the ingredient to be added
     */
    public void addIngredient(String ingredient) {
        if (!this.ingredients.contains(ingredient)) {
            this.ingredients.add(ingredient);
        }
    }
    
    /**
     * Get all the ingredients in a Recipe
     * @return ArrayList<String>: the ArrayList of all the ingredients
     */
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    
    @Override
    /**
     * Return a String in the following format
     * [name], cooking time: [cooking time]
     */
    public String toString() {
        return name + ", cooking time: " + cookingTime;
    }
}
