
public class ClockHand {
    // Variables
    private int value;
    private int limit;

    // Constructors
    /**
     * Construct the clock hand with a limit
     * @param limit int: the upper limit of the clock hand
     */
    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    // Methods
    /**
     * Advance the clock hand by one. When it reaches the upper limit it resets to 0.
     */
    public void advance() {
        this.value = this.value + 1;

        if (this.value >= this.limit) {
            this.value = 0;
        }
    }

    /**
     * Get the value of the clock hand.
     * @return int: clock hand value
     */
    public int value() {
        return this.value;
    }

    /**
     * Print the clock hand value in "00" format as a string.
     * @return String: the clock hand value in double digits
     */
    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }

        return "" + this.value;
    }
}
