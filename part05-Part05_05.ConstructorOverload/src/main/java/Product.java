
public class Product {
    // Variables
    private String name;
    private String location;
    private int weight;

    // Constructors
    /**
     * Construct Product class
     * @param name String: the product name
     * @param location String: the product's location
     * @param weight int: the product's weight
     */
    public Product(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }
    /**
     * Overloaded constructor (with location set to "shelf" and weight set to 1)
     * @param name String: the product name
     */
    public Product(String name) {
        this(name, "shelf", 1);
    }
    /**
     * Overloaded constructor (with weight set to 1)
     * @param name String: the product name
     * @param location String: the product's location
     */
    public Product(String name, String location) {
        this(name, location, 1);
    }
    /**
     * Overloaded constructor (with location set to "shelf")
     * @param name String: the product name
     * @param weight int: the product's weight
     */
    public Product(String name, int weight) {
        this(name, "shelf", weight);
    }

    // Methods
    /**
     * Get the product name
     * @return String: the product name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the product weight
     * @return int: the product's weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Get the product's location
     * @return String: the product's location
     */
    public String getLocation() {
        return location;
    }

    @Override
    /**
     * Return a String in the following format:
     * [name] ([weight] kg) can be found from the [location]
     */
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }
}
