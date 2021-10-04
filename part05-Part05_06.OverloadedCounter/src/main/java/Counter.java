/**
 * Counter class for Part05_06
 * @author frank
 */
public class Counter {
    // Variables
    private int value;
    
    // Constructors
    /**
     * Construct the Counter
     * @param value int: the initial value of the counter
     */
    public Counter(int value) {
        this.value = value;
    }
    /**
     * Construct the Counter (Initial value set to 0)
     */
    public Counter(){
        this(0);
    }
    
    // Methods
    /**
     * Return the value of the counter
     * @return int: the counter's value
     */
    public int value() {
        return value;
    }
    /**
     * Increase the value by a given value
     * If the value of increaseBy is negative, the value of the counter does not change.
     * @param increaseBy int: the amount to increase the value by
     */
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            value+= increaseBy;
        }
    }
    /**
     * Increase the value by 1
     */
    public void increase() {
        this.increase(1);
    }
    /**
     * Decrease the value by a given value
     * If the value of decreaseBy is negative, the value of the counter does not change.
     * @param decreaseBy int: the amount to decrease the value by
     */
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            value-= decreaseBy;
        }
    }
    /**
     * Decrease the value by 1
     */
    public void decrease() {
        this.decrease(1);
    }
    
    @Override
    /**
     * Print the value of the string in the following format
     * The value of the counter is: [value]
     */
    public String toString() {
        return "The value of the counter is: " + Integer.toString(value);
    }
}
