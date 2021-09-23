
/**
 * Create the following method in the exercise template: 
 * public static void printUntilNumber(int number). 
 * It should print the numbers from one to the number passed as a parameter. 
 * 
 * @author frank
 */
public class FromOneToParameter {

    public static void main(String[] args) {
        // Call method
        printUntilNumber(5);
    }
    
    public static void printUntilNumber(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

}
