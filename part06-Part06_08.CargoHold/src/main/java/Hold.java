/**
 * Hold Class for Part06_08
 * @author frank
 */
import java.util.ArrayList;

public class Hold {
    // Variables
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    // Constructors
    /**
     * Construct the Hold
     * @param maxWeight int: the maximum weight the Hold can handle
     */
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    // Methods
    /**
     * Add a Suitcase to the Hold as long as it doesn't exceed the maximum weight limit
     * @param suitcase Suitcase: the Suitcase to be added
     */
    public void addSuitcase(Suitcase suitcase) {
        if (!suitcases.contains(suitcase)) {
            int weight = 0;
            for (Suitcase scase : suitcases) {
                weight+= scase.totalWeight();
            }
            if ((weight + suitcase.totalWeight() <= maxWeight)) {
                suitcases.add(suitcase);
            }
        }
    }
    
    /**
     * Print the contents of the Items in each Suitcase in the Hold
     */
    public void printItems() {
        if (suitcases.isEmpty()) {
            System.out.println("There are no suitcases in the hold.");
        } else {
            for (Suitcase suitcase : suitcases) {
                suitcase.printItems();
            }
        }
    }
    
    @Override
    /**
     * Return a String in the following format:
     * [total number of suitcases] suitcases ([total weight of suitcases] kg)
     */
    public String toString() {
        if (suitcases.isEmpty()) {
            return "0 suitcases (0 kg)";
        }
        int weight = 0;
        for (Suitcase suitcase : suitcases) {
            weight+= suitcase.totalWeight();
        }
        if (suitcases.size() == 1) {
            return suitcases.size() + " suitcase (" + weight + " kg)";
        } else {
            return suitcases.size() + " suitcases (" + weight + " kg)";
        }
    }
}
