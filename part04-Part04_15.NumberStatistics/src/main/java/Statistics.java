/**
 * Statistics Class
 * @author frank
 */
public class Statistics {
    // Class variables
    private int count;
    private int sum;
    
    // Constructors
    public Statistics() {
        count = 0;
        sum = 0;
    }
    
    // Methods
    /**
     * Increments the count total by 1 and adds the number to the sum
     * @param number int: number to be added
     */
    public void addNumber(int number) {
        count++;
        sum+= number;
    }
    
    /**
     * Get the count
     * @return int: the class total count
     */
    public int getCount() {
        return count;
    }
    
    /**
     * Return the sum of all the numbers
     * @return int: the total sum
     */
    public int sum() {
        return sum;
    }
    
    /**
     * The average of all the numbers
     * @return double: the average of the numbers summed.
     */
    public double average() {
        if (count == 0) {
            return 0.0;
        }
        return ((double)sum / count);
    }
    
}
