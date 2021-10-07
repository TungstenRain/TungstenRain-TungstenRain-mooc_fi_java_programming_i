/**
 * Bird Class for Part07_08
 * @author frank
 */
public class Bird {
    // Variables
    private String name;
    private String latinName;
    private int observations;
    
    // Constructors
    /**
     * Construct the Bird
     * @param name String: the bird name
     * @param latinName String: the latin name for the bird
     * @param observations int: the number of observations of the bird
     */
    public Bird(String name, String latinName, int observations) {
        this.name = name;
        this.latinName = latinName;
        this.observations = observations;
    }
    /**
     * Construct the Bird with 0 observations
     * @param name String: the bird name
     * @param latinName String: the latin name for the bird
     */
    public Bird(String name, String latinName) {
        this(name, latinName, 0);
    }
    
    // Methods
    /**
     * Set the Bird name
     * @param name String: the name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Get the Bird name
     * @return String: the name
     */
    public String getName() {
        return name;
    }
    /**
     * Set the Bird's latin name
     * @param latinName String: the latin name
     */
    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }
    /**
     * Get the Bird's latin name
     * @return String: the latin name
     */
    public String getLatinName() {
        return latinName;
    }
    /**
     * Set the total number of observations
     * @param observations int: the total number of observations
     */
    public void setObservations(int observations) {
        this.observations = observations;
    }
    /**
     * Get the total number of observations
     * @return 
     */
    public int getObservations() {
        return observations;
    }
    /**
     * Add an observation of the Bird
     */
    public void addObservation() {
        this.observations++;
    }
    
    @Override
    /**
     * Print a String in the following format
     * [name] ([latin name]): [number of observations] observations
     */
    public String toString() {
        return name + " (" + latinName + "): " + observations + " observations";
    }
}