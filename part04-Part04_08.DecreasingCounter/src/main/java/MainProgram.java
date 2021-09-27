/**
 * Program to demonstrate DecreasingCounter Class
 * @author frank
 */
public class MainProgram {

    public static void main(String[] args) {
        // Instantiate the DecreasingCounter class
        DecreasingCounter counter = new DecreasingCounter(100);

        // Display initial value
        counter.printValue();
        
        // Reset counter and display value
        counter.reset();
        counter.printValue();
        
        // Attempt to decrement the counter and display value
        counter.decrement();
        counter.printValue();
    }
}
