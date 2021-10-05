/**
 * Product Class for Part05_15
 * @author frank
 */
import java.util.Objects;

public class Product {
    // Variables
    private String name;
    private String identifier;
    
    // Constructors
    /**
     * Construct the product
     * @param name String: the product name
     * @param identifier String: the product identifier
     */
    public Product(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }
    
    // Methods
    /**
     * Get the name
     * @return String: the product name
     */
    public String getName() {
        return name;
    }
    /**
     * Get the identifier
     * @return String: the product identifier
     */
    public String getIdentifier() {
        return identifier;
    }
    
    /**
     * Compare this Product to another object
     * @param compared Object: the object to compare
     * @return boolean: true if equal; false otherwise
     */
    public boolean equals(Object compared) {
        // if the variables are in the same location they are equal
        if (this == compared) {
            return true;
        }
        
        // if the compared object is not of type Product, they are not equal
        if (!(compared instanceof Product)) {
            return false;
        }
        
        // Cast the object into type Product and compare variables
        Product comparedProduct = (Product) compared;
        return (this.identifier.equals(comparedProduct.identifier));
    }
    
    @Override
    /**
     * Return a String with the following format:
     * [identifier]: [name]
     */
    public String toString() {
        return identifier + ": " + name;
    }
}
