/**
 * Timer Class 
 * @author frank
 */
public class Timer {
    // Variables
    private ClockHand seconds;
    private ClockHand hundredthOfASecond;
    
    // Constructors
    /**
     * Construct the Timer class with seconds, and microseconds
     */
    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredthOfASecond = new ClockHand(100);
    }
    
    // Methods
    /**
     * Advance the timer by microseconds
     */
    public void advance() {
        this.hundredthOfASecond.advance();
        
        if (this.hundredthOfASecond.value() == 0) {
            this.seconds.advance();
        }
    }
    
    @Override
    /**
     * Return a String in the following format
     * [seconds]:[microseconds]
     */
    public String toString() {
        return seconds + ":" + hundredthOfASecond;
    }
}
