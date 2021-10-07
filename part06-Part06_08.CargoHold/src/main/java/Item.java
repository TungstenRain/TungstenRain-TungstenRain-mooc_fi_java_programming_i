/**
 * Item Class for Part06_08
 * @author frank
 */
public class Item {
    // Variables
    private String name;
    private int weight;
    
    // Constructors
    /**
     * Construct the Item
     * @param name String: the item's name
     * @param weight int: the item's weight
     */
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    // Methods
    /**
     * Get the name
     * @return String: the item name
     */
    public String getName() {
        return name;
    }
    /**
     * Get the weight
     * @return int: the item weight
     */
    public int getWeight() {
        return weight;
    }
    
    @Override
    /**
     * Returns a String in the following format:
     * [name] ([weight] kg)
     */
    public String toString() {
        return name + " (" + weight + " kg)";
    }
}
