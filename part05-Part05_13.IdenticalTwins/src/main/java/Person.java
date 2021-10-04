
import java.util.Objects;

public class Person {
    // Variables
    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;
    
    // Constructors
    /**
     * Construct the Person
     * @param name String: the person's name
     * @param birthday SimpleDate: the person's birthday
     * @param height int: the person's height
     * @param weight int: the person's weight
     */
    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // Methods
    /**
     * Determine if this Person is equal to another object
     * @param compared Object: the object to compare to
     * @return boolean: true if equal; false otherwise
     */
    public boolean equals(Object compared) {
        // if all the variables are in the same location they are equal
        if (this == compared) {
            return true;
        }
        
        // if the compared object is not of this type they are not equal
        if (!(compared instanceof Person)) {
            return false;
        }
        
        // Cast the object to Person and compare variables
        Person comparedPerson = (Person) compared;
        if (this.name.equals(comparedPerson.name) 
                && this.birthday.equals(comparedPerson.birthday)
                && this.height == comparedPerson.height
                && this.weight == comparedPerson.weight) {
            return true;
        }
        
        // Otherwise the objects are not equal
        return false;
    }
}
