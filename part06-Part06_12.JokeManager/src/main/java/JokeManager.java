/**
 * JokeManager Class for Part06_12
 * @author frank
 */

import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    // Variables
    private ArrayList<String> jokes;
    
    // Constructor
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    // Methods
    /**
     * Add a joke
     * @param joke String: the joke
     */
    public void addJoke(String joke) {
        if (!jokes.contains(joke)) {
            jokes.add(joke);
        }
    }
    
    /**
     * Draw a random joke
     * @return String: a random joke
     */
    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        
        // Get a random joke
        int random = new Random().nextInt(jokes.size());
        return jokes.get(random);
    }
    
    /**
     * Print all the jokes
     */
    public void printJokes() {
        if (jokes.isEmpty()) {
            System.out.println("Jokes are in short supply.");
        }
        
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
