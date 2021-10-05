/**
 * Package Class for Part06_05
 * @author frank
 */
import java.util.ArrayList;

public class Package {
    // Variables
    private ArrayList<Gift> gifts;
    
    // Constructors
    /**
     * Construct the Package
     */
    public Package() {
        this.gifts = new ArrayList<>();
    }
        
    // Methods
    /**
     * Add a Gift to this
     * @param gift Gift: the gift to be added
     */
    public void addGift(Gift gift) {
        if (!gifts.contains(gift)) {
            gifts.add(gift);
        }
    }
    
    /**
     * Get the total weight of the package
     * @return int: the total weight
     */
    public int totalWeight() {
        int total = 0;
        for (Gift gift : gifts) {
            total+= gift.getWeight();
        }
        return total;
    }
}
