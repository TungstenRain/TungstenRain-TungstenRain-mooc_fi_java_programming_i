
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // Instantiate Timer class
        Timer timer = new Timer();
        
        /**
         * Show the timer advancing by microseconds
         * 
         * NOTE: This will run as an infinite loop and you will need to manually stop the timer.
         */
        while (true) {
            System.out.println(timer);
            timer.advance();
            
            try {
                // Sleep the program for 1 hundredth of a second
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
