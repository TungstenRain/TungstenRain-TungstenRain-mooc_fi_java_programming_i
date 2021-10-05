
public class Main {
    public static void main(String[] args) {
        // Instantiate the Menu
        Menu menu = new Menu();
        
        // Add meals to the menu
        menu.addMeal("Smoked salmon, white wine and butter sauce with basil");
        menu.addMeal("Smoked salmon, white wine and butter sauce with basil");
        menu.addMeal("Seasonal green salad with apple-honey vinegarette");
        menu.addMeal("Roasted lamb in a red wine sauce");
        
        // Display the menu
        menu.printMeals();
        
        // Clear and print the menu
        menu.clearMenu();
        menu.printMeals();
    }
}
