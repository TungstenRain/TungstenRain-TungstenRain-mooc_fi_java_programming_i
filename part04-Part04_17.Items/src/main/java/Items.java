
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        // Instantiate classes and objects
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Request and capture user data
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            // Instantiate item and add to ArrayList
            items.add(new Item(name));
        }
        
        // Display results to user
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
