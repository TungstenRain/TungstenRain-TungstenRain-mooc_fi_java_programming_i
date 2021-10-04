
public class Apartment {
    // Variables
    private int rooms;
    private int squares;
    private int pricePerSquare;
    
    // Constructors
    /**
     * Construct the Apartment
     * @param rooms int: the number of rooms
     * @param squares int: the number of squares (feet or meters)
     * @param pricePerSquare int: the price per square
     */
    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    // Methods
    /**
     * Determine if this apartment is larger (in squares) than another
     * @param compared Apartment: the apartment to be compared
     * @return boolean: true if larger; false otherwise
     */
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }
    
    /**
     * Get the price difference between two apartments
     * @param compared Apartment: the apartment to be compared to
     * @return int: the price difference between the two apartments
     */
    public int priceDifference(Apartment compared) {
        return Math.abs((this.pricePerSquare * this.squares) - (compared.pricePerSquare * compared.squares));
    }
    
    /**
     * Determine if the apartment is larger than another
     * @param compared Apartment: the apartment to be compared to
     * @return boolean: true if larger; false otherwise
     */
    public boolean moreExpensiveThan(Apartment compared) {
        if ((this.pricePerSquare * this.squares) > (compared.pricePerSquare * compared.squares)) {
            return true;
        }
        return false;
    }
}
