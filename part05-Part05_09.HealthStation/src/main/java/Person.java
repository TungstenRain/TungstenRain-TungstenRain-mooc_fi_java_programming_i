/*
 *  Do not change the behavior of this class
 */

public class Person {
    // Variables
    private String name;
    private int age;
    private int height;
    private int weight;

    // Constructors
    /**
     * Construct the Person
     * @param name String: the person's name
     * @param age int: the person's age
     * @param height int: the person's height
     * @param weight int: the person's weight
     */
    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    
    // Methods
    /**
     * Print the person's information in the following format
     * My name is [name] and I am [age] years old
     */
    public void printPerson() {
        System.out.println("My name is " + this.name + " and I am " + this.age + " years old");
    }

    /**
     * Increment the person's age
     */
    public void growOlder() {
        this.age++;
    }
    
    /**
     * Determine if the person is of legal age (older than 17)
     * @return boolean: true if over 17; otherwise false
     */
    public boolean isOfLegalAge() {
        return (this.age > 17);
    }
    
    /**
     * Set the person's height
     * @param height int: the person's height
     */
    public void setHeight(int height) {
        this.height = height;
    }
    
    /**
     * Get the person's height
     * @return int: the person's height
     */
    public int getHeight() {
        return this.height;
    }
    
    /**
     * Get the person's weight
     * @return int: the person's weight
     */
    public int getWeight() {
        return this.weight;
    }
    
    /**
     * Set the person's weight
     * @param weight int: the person's weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    /**
     * Get the Body Mass Index for the person
     * @return double: the person's BMI
     */
    public double bmi() {
        double heightInMeters = this.height / 100.0;

        return this.weight / (heightInMeters * heightInMeters);
    }

    /**
     * Get the person's name
     * @return String: the person's name
     */
    public String getName() {
        return this.name;
    }

    @Override
    /**
     * Return a string in the following format
     * My name is [name] and I am [age] years old. My BMI is [BMI]
     */
    public String toString() {
        return "My name is " + this.name + " and I am " + this.age + " years old. My BMI is " + this.bmi();
    }
}
