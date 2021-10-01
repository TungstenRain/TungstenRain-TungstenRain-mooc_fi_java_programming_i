/**
 * Agent Class for part 04_13
 * @author frank
 */
public class Agent {
    // Class variables
    private String firstName;
    private String lastName;
    
    // Constructors
    /**
     * Construct the Agent Class
     * @param initFirstName String: agent's first name
     * @param initLastName String: agent's last name
     */
    public Agent(String initFirstName, String initLastName) {
        this.firstName = initFirstName;
        this.lastName = initLastName;
    }
    
    // Methods
    /**
     * Print the following:
     * My name is [Agent's last name], [Agent's first name] [Agent's last name]
     * 
     * NOTE: Deprecated
     */
    public void print() {
        // System.out.println("My name is " + this.lastName + ", " + this.firstName + " " + this.lastName);
    }
    
    /**
     * Return the following String:
     * My name is [Agent's last name], [Agent's first name] [Agent's last name]
     * 
     * @return String
     */
    public String toString() {
        return ("My name is " + this.lastName + ", " + this.firstName + " " + this.lastName);
    }
    
}
