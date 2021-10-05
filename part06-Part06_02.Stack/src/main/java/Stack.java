/**
 * Stack Class for Part06_02
 * @author frank
 */

import java.util.ArrayList;

public class Stack {
    // Variables
    private ArrayList<String> stacks;
    
    // Constructors
    /**
     * Construct the Stack
     */
    public Stack() {
        this.stacks = new ArrayList<>();
    }
        
    // Methods
    /**
     * Determine if the Stack is empty
     * @return boolean: true if empty; false otherwise
     */
    public boolean isEmpty() {
        return (stacks.isEmpty());
    }
    
    /**
     * Add to the Stack
     * @param value String: what is to be added
     */
    public void add(String value) {
        if (!stacks.contains(value)) {
            stacks.add(value);
        }
    }
    
    /**
     * Get the Stack
     * @return ArrayList<String>: the values in the Stack
     */
    public ArrayList<String> values() {
        return stacks;
    }
    
    /**
     * Remove the last item in the Stack and return it
     * @return String: the last element in the Stack
     */
    public String take() {
        return (stacks.remove(stacks.size() - 1));
    }
}
