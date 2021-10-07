/**
 * Exercise Class for Part06_13
 * @author frank
 */
public class Exercise {
    // Variables
    private String name;
    private boolean completed;
    
    // Constructors
    /**
     * Construct the Exercise
     * @param name String: the exercise name
     */
    public Exercise(String name) {
        this.name = name;
        this.completed = false;
    }
    
    // Methods
    /**
     * Get the exercise name
     * @return String: the exercise name
     */
    public String getName() {
        return name;
    }
    /**
     * Set the completed status
     * @param completed boolean: the completed state. True if completed, false otherwise.
     */
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    /**
     * Determine if the exercise is completed
     * @return boolean: true if completed; false otherwise
     */
    public boolean isCompleted() {
        return completed;
    }
}
