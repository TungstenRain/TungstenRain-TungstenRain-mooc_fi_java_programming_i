/**
 * Whistle Class for Part04_05
 * @author frank
 */
public class Whistle {
    // Class variables
    private String sound;
    
    // Constructor
    /**
     * Construct the Whistle class
     * @param sound, String; the sound the class makes
     */
    public Whistle(String sound) {
        this.sound = sound;
    }
    
    // Methods
    public void sound() {
        System.out.println(this.sound);
    }
    
}
