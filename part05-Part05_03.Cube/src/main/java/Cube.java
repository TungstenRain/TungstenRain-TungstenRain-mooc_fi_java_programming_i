/**
 * Cube Class for Part05_03
 * @author frank
 */
public class Cube {
    // Variables
    private int edgeLength;
    
    // Constructor
    /**
     * Construct the Cube
     * @param edgeLength int: the length of each side
     */
    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }
    
    // Methods
    /**
     * Get the cube volume
     * @return int: the cube's volume
     */
    public int volume() {
        return (int) Math.pow(edgeLength, 3);
    }
    
    @Override
    /**
     * Return a statement about the cube in the following format:
     * The length of the edge is [edgeLength] and the volume [volume()]
     */
    public String toString() {
        return "The length of the edge is " + edgeLength + " and the volume " + volume();
    }
}
