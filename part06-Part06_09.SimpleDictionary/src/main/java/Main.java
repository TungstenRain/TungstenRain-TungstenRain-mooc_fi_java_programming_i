import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Instantiate Classes
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();
        TextUI textUI = new TextUI(scanner, dictionary);
        
        // Run the TextUI
        textUI.start();
    }
}
