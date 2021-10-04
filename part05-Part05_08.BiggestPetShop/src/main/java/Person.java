// NOTE: this was modified to remove the naming error in the toString method
public class Person {
    // Variables
    private String name;
    private Pet pet;

    // Constructors
    /**
     * Construct the Person
     * @param name String: the person's name
     * @param pet Pet: the person's pet
     */
    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }
    /**
     * Construct the Person with a pet dragon named Toothless
     * @param name String: the person's name
     */
    public Person(String name) {
        this(name, new Pet("Toothless", "dragon"));
    }
    /**
     * Constructor that gives the person's name as Lilo and the Pet as a blue alien named Stitch
     */
    public Person() {
        this("Lilo", new Pet("Stitch", "blue alien"));
    }

    @Override
    /**
     * Returns a String in the following format
     * [name], has a friend called [pet.name] ([pet.breed])
     */
    public String toString() {
        return name + ", has a friend called " + pet.getName() + " (" + pet.getBreed() + ")";
    }

}
