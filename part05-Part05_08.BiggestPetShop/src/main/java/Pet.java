
public class Pet {
    // Variables
    private String name;
    private String breed;
    
    // Constructors
    /**
     * Construct the pet
     * @param name String: the pet's name
     * @param breed String: the breed of the pet
     */
    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    
    // Methods
    /**
     * Get the pet's name
     * @return String: the pet's name
     */
    public String getName() {
        return name;
    }
    /**
     * Get the pet's breed
     * @return String: the pet's breed
     */
    public String getBreed() {
        return breed;
    }

}
