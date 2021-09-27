/**
 * Demonstration of using a class to store and print product information
 * @author frank
 */
public class Main {

    public static void main(String[] args) {
        // Instantiate the Product class
        Product product = new Product("Banana", 1.1, 13);
        
        // Display the product information
        product.printProduct();
    }
}
