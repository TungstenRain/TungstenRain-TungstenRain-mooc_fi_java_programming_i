
public class HealthStation {
    // Variales
    private int weighings;
    
    // Constructors
    /**
     * Construct the HealthStation class with 0 weighings
     */
    public HealthStation() {
        weighings = 0;
    }
    
    // Methods
    /**
     * Get the person's weight
     * @param person Person: the person to be weighed
     * @return int: the person's weight
     */
    public int weigh(Person person) {
        weighings++;
        return person.getWeight();
    }
    
    /**
     * Increment the person's weight by 1
     * @param person Person: the person to be fed
     */
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings(){
        return weighings;
    }
}