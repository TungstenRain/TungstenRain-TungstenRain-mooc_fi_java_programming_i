
import java.util.HashMap;

public class SimpleDictionary {
    // Variables
    private HashMap<String, String> translations;
    
    // Constructors
    /**
     * Construct the SimpleDictionary
     */
    public SimpleDictionary() {
        this.translations = new HashMap<>();
    }
    
    // Methods
    /**
     * Get the translation according to the HashMap
     * @param word String: the word to be translated
     * @return String: the translation
     */
    public String translate(String word) {
        return this.translations.get(word);
    }
    /**
     * Add a word and its translation to the HashMap
     * @param word String: the word
     * @param translation String: it's translation
     */
    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }
}
