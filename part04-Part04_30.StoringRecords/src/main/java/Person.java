
public class Person {
    // Variables
    private String name;
    private int age;

    // Constructors
    /**
     * Construct the Person
     * @param name String: the person's name
     * @param age int: the person's age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    /**
     * Get the person's name
     * @return String: the person's name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the person's age
     * @return int: the person's age
     */
    public int getAge() {
        return age;
    }

    @Override
    /**
     * Return a String of the Person with the following format:
     * [name] , age: [age]
     */
    public String toString() {
        return this.name + ", age: " + this.age;
    }

}
