/**
 * Product class for Part04_07
 * @author frank
 */
public class Product {
    // Class variables
    private double price;
    private int quantity;
    private String name;
    
    // Constructor
    /**
     * Construct the Product class
     * @param initialName, String; product name
     * @param initialPrice, double; product's initial price
     * @param initialQuantity, int; product's initial quantity
     */
    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }
    
    // Method
    /**
     * Print the product information in the following format
     *     name, price N.N, quantity NN pcs
     */
    public void printProduct() {
        System.out.println(name + ", price " + price + ", " + quantity + " pcs");
    }
    
}
