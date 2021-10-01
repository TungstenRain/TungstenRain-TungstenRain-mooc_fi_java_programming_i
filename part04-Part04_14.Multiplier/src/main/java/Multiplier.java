/**
 * Multiplier Class for part 04_14
 * @author frank
 */
public class Multiplier {
    // Class variables
    private int value;
    
    // Constructors
    /**
     * Construct the Multiplier class
     * @param number int: the value of the Multiplier
     */
    public Multiplier(int number) {
        this.value = number;
    }
    
    // Methods
    /**
     * Multiply the class by a number
     * @param number int: the number to multiply by
     * @return int: the product of the given number and the class value
     */
    public int multiply(int number) {
        return (value * number);
    }
    
}
