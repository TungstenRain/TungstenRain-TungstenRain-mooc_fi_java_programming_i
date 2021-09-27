/**
 * Song Class for Part 04_10
 * @author frank
 */
public class Song {
    // Class Variables
    private String name;
    private int length;
    
    // Constructors
    /**
     * Construct the class
     * @param name String: name of the song
     * @param length int: song length
     */
    public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }
    
    // Methods
    /**
     * Get the song name
     * @return String: the song name
     */
    public String name() {
        return name;
    }
    
    /**
     * Get the song length
     * @return int: song length
     */
    public int length() {
        return length;
    }
}
