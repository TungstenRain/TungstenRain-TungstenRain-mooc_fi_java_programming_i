/**
 * Suitcase Class for Part06_08
 * @author frank
 */
import java.util.ArrayList;
public class Suitcase {
    // Variables
    private int maxWeight;
    private ArrayList<Item> contents;
    
    // Constructors
    /**
     * Construct the Suitcase
     * @param maxWeight int: the maximum weight the suitcase can handle
     */
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.contents = new ArrayList<>();
    }
    
    // Methods
    /**
     * Add an Item to the Suitcase as long as it doesn't exceed the maximum weight limit
     * @param item Item: the item to be added
     */
    public void addItem(Item item) {
        int currentWeight = 0;
        for (Item element : contents) {
            currentWeight+= element.getWeight();
        }
        if ((currentWeight + item.getWeight()) <= maxWeight) {
            contents.add(item);
        }
    }
    
    /**
     * Print all the Items in the Suitcase
     */
    public void printItems() {
        if (contents.isEmpty()) {
            System.out.println("The suitcase is empty.");
        } else {
            for (Item item : contents) {
                System.out.println(item);
            }
        }
    }
    
    /**
     * Get the total weight of the contents of the Suitcase
     * @return int: the total weight
     */
    public int totalWeight() {
        int weight = 0;
        for (Item item : contents) {
            weight+= item.getWeight();
        }
        return weight;
    }
    
    /**
     * Identify the heaviest item in the Suitcase
     * @return Item: the heaviest item
     */
    public Item heaviestItem() {
        if (contents.isEmpty()) {
            return null;
        }
        Item heaviest = contents.get(0);
        for (Item item : contents) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
    
    @Override
    /**
     * Return a String in the following format:
     * [number of items] items ([total weight] kg)
     */
    public String toString() {
        if (contents.isEmpty()) {
            return "no items (0 kg)";
        }
        
        int weight = this.totalWeight();
        if (contents.size() == 1) {
            return contents.size() + " item (" + weight + " kg)";
        } else {
            return contents.size() + " items (" + weight + " kg)";
        }
    }
}
