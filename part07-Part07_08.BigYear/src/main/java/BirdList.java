/**
 * BirdList Class for Part07_08
 * @author frank
 */
import java.util.ArrayList;

public class BirdList {
    // Variables
    private ArrayList<Bird> flock;
    
    // Constructors
    /**
     * Construct the BirdList
     * @param flock ArrayList<Bird>: an ArrayList of Birds
     */
    public BirdList(ArrayList<Bird> flock) {
        this.flock = new ArrayList<>();
        for (Bird bird : flock) {
            if (!this.flock.contains(bird)) {
                this.flock.add(bird);
            }
        }
    }
    /**
     * Construct the BirdList
     */
    public BirdList() {
        this(new ArrayList<>());
    }
        
    // Methods
    /**
     * Add a Bird to the BirdList
     * @param name String: the bird name
     * @param latinName String: the latin name for the bird
     */
    public void addBird(String name, String latinName) {
        Bird bird = new Bird(name, latinName);
        
        if (!this.hasBird(bird)) {
            flock.add(bird);
        }
    }
    /**
     * Determine if the BirdList already has the bird
     * @param bird Bird: the bird in question
     * @return boolean: true if the BirdList has the bird; false otherwise
     */
    private boolean hasBird(Bird bird) {
        for (Bird b : flock) {
            if (b.getName().equals(bird.getName()) && b.getLatinName().equals(bird.getLatinName())) {
                return true;
            }
        }
        return false;
    }
    /**
     * Add an observation of a particular bird
     * @param name String: the name of the bird
     */
    public void addObservation(String name) {
        for (Bird bird : flock) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
            }
        }
    }
    /**
     * Print the specified Bird
     * @param name String: the bird name to be printed
     */
    public void printBird(String name) {
        String text = "Not a bird!";
        for (Bird bird : flock) {
            if (bird.getName().equals(name)) {
                text = bird.toString();
            }
        }
        System.out.println(text);
    }
    /**
     * Print all the birds in the BirdList
     */
    public void printAll() {
        for (Bird bird : flock) {
            System.out.println(bird);
        }
    }
}