// Don't modfy this class
import java.util.Objects;

public class Person {
    // Variables
    private String name;
    private int height;
    
    // Constructors
    /**
     * Construct the Person
     * @param name String: the person's name
     * @param height int: the person's height
     */
    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }
    
    // Methods
    /**
     * Get the name
     * @return String: the Person's name
     */
    public String getName() {
        return name;
    }
    /**
     * Get the height
     * @return int: the Person's height
     */
    public int getHeight() {
        return height;
    }

    @Override
    /**
     * Return a String in the following format:
     * [name] ([height] cm)
     */
    public String toString() {
        return this.name + " (" + this.height + " cm)";
    }

    // Created with the insert code functionality of NetBeans
    @Override
    /**
     * Determine if this equals another object
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.height != other.height) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

}
