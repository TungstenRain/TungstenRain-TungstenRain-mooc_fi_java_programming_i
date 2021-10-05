
import java.util.ArrayList;

public class SimpleCollection {
    // Variables
    private String name;
    private ArrayList<String> elements;
    
    // Constructors
    /**
     * Construct the SimpleCollection
     * @param name String: the name of the SimpleCollection
     */
    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }
    
    // Methods
    /**
     * Add an element to this
     * @param element String: the element to add
     */
    public void add(String element) {
        this.elements.add(element);
    }
    /**
     * Get the elements in this
     * @return ArrayList<String>: all the elements in this
     */
    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
        String printOutput = "The collection " + this.name;
        if (this.elements.isEmpty()) {
            return printOutput + " is empty.";
        }
        
        String allElements = "";
        for (String element : elements) {
            allElements+= "\n" + element;
        }
        
        if (this.elements.size() == 1) {
            return printOutput + " has " + this.elements.size() + " element:" + allElements;
        } else {
            return printOutput + " has " + this.elements.size() + " elements:" + allElements;
        }
    }
}
