
public class DecreasingCounter {
    // Class variables
    private int value;  // an object variable for storing the value of the counter

    // Constructors
    /**
     * Construct the Class with an initial value
     * @param initialValue int; the initial value
     */
    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    // Methods
    /**
     * Print the value of the counter
     */
    public void printValue() {
        // Do not change this code!
        System.out.println("value: " + this.value);
    }

    /**
     * Decrement the counter. Counter value cannot decrease below 0
     */
    public void decrement() {
        if (value > 0) {
            value--;
        }
    }

    /**
     * Reset the counter to 0
     */
    public void reset() {
        value = 0;
    }
}
