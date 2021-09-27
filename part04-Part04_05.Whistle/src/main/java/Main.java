/**
 * A demonstration of using a class with a private variable, constructor and method
 * 
 * @author frank
 */
public class Main {

    public static void main(String[] args) {
        // This is just an empty main method you can use to test
        // the Whistle class. Try for example:

        // Instantiate the Whistle Classes
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");
        
        // Call the sound method from the Whistle class
        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
    }
}
