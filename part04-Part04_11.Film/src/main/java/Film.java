/**
 * Film Class for Part 04_11
 * @author frank
 */
public class Film {
    // Class variables
    private String name;
    private int ageRating;
    
    // Constructors
    /**
     * Class Constructor
     * @param filmName String: the film name
     * @param filmAgeRating int: the age rating for the film
     */
    public Film(String filmName, int filmAgeRating) {
        this.name = filmName;
        this.ageRating = filmAgeRating;
    }
    
    // Methods
    /**
     * Get film name
     * @return String: the film's name
     */
    public String name() {
        return name;
    }
    
    /**
     * Get film age rating
     * @return int: the film's age rating
     */
    public int ageRating() {
        return ageRating;
    }
}
