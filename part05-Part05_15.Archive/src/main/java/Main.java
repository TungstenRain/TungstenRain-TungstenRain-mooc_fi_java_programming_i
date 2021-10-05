
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Instantiate Scanner and ArrayList Classes
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        
        // Request and capture user input
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            
            // Instantiate the Product class
            Product product = new Product(name, identifier);
            
            // if not already in the list, add to the list
            if (!(products.contains(product))) {
                products.add(product);
            }
        }
        
        // Display results to the user
        System.out.println("==Items==");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
