/**
 * Gift Class for Part06_05
 * @author frank
 */
public class Gift {
    // Variables
    private String name;
    private int weight;
    
    // Construcots
    /**
     * Construct the Gift
     * @param name String: the gift name
     * @param weight int: the gift weight
     */
    public Gift(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    // Methods
    /**
     * Get the name
     * @return String: the name
     */
    public String getName() {
        return name;
    }
    /**
     * Get the weight
     * @return int: the weight
     */
    public int getWeight() {
        return weight;
    }
    
    @Override
    /**
     * Return a String in the following format
     * [name] + ([weight} kg)
     */
    public String toString() {
        return name + " (" + weight + " kg)";
    }
        
}
