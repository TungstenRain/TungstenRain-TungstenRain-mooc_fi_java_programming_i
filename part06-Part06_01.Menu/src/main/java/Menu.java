
import java.util.ArrayList;

public class Menu {
    // Variables
    private ArrayList<String> meals;
    
    // Constructors
    /**
     * Construct the Menu
     */
    public Menu() {
        this.meals = new ArrayList<>();
    }
    
    // Methods
    /**
     * Add a meal to the menu
     * @param meal String: the meal to add
     */
    public void addMeal(String meal) {
        if (!meals.contains(meal)) {
            meals.add(meal);
        }
    }
    
    /**
     * Print all the meals in the menu
     */
    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }
    
    /**
     * Remove all meals from the menu
     */
    public void clearMenu() {
        meals.clear();
    }
}
