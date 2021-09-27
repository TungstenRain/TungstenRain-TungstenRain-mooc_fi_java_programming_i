/**
 * Gauge Class for part 04_12
 * @author frank
 */
public class Gauge {
    // Class Variables
    private int value;
    
    // Constructors
    /**
     * Construct the class with no parameters. Value set to 0.
     */
    public Gauge() {
        this.value = 0;
    }
    
    // Methods
    /**
     * Increment the value by 1, but will not increase beyond 5
     */
    public void increase() {
        if (value < 5) {
            value++;
        }
    }
    
    /**
     * Decrement the value by 1, but will not decrease below 0
     */
    public void decrease() {
        if (value > 0) {
            value--;
        }
    }
    
    /**
     * Get the value
     * @return int: the value
     */
    public int value() {
        return value;
    }
    
    /**
     * If the value is equal to 5, return true; otherwise return false;
     * @return boolean
     */
    public boolean full() {
        return (value == 5);
    }
    
}
