/**
 * Person Class for part05_07
 * This wasn't necessary, but fun
 * @author frank
 */
public class Person {
    // Variables
    private String name;
    private int age;
    
    // Constructors
    /**
     * Construct the Person class
     * @param name String: the person's name
     * @param age int: the person's age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Methods
    /**
     * Get the name
     * @return String: the person's name
     */
    public String getName() {
        return name;
    }
    /**
     * Get the age
     * @return int: the person's age
     */
    public int getAge() {
        return age;
    }
    /**
     * Increment the person's age by 1 year
     */
    public void makeOlder() {
        age++;
    }
    
    @Override
    public String toString() {
        return name + " is " + age + " years old.";
    }
}
