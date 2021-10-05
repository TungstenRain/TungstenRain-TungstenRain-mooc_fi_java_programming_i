
import java.util.ArrayList;

public class SimpleCollection {
    // Variables
    private String name;
    private ArrayList<String> elements;
    
    // Constructors
    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }
    
    // Mehtods
    /**
     * Add an element to the SimpleCollection
     * @param element String: the element to add
     */
    public void add(String element) {
        this.elements.add(element);
    }
    /**
     * Get the elements of this SimpleCollection
     * @return ArrayList<String>: the elements
     */
    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }
        
        String longest = this.elements.get(0);
        for (String element : elements) {
            if (element.length() > longest.length()) {
                longest = element;
            }
        }
        return longest;
    }
}
