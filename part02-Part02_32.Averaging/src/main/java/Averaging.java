/**
 * Create a method called average that calculates the average of the numbers 
 * passed as parameters. The previously created method sum must be used 
 * inside this method!
 * 
 * @author frank
 */
public class Averaging {

    /**
     * Sum the values of the given numbers
     * @param number1 int
     * @param number2 int
     * @param number3 int
     * @param number4 int
     * @return int; the sum of the values
     */
    public static int sum(int number1, int number2, int number3, int number4) {
        // Return the sum of the numbers
        return (number1 + number2+ number3 + number4);
    }

    /**
     * Calculate the average of the given numbers
     * @param number1 int
     * @param number2 int
     * @param number3 int
     * @param number4 int
     * @return double; the average of the numbers
     */
    public static double average(int number1, int number2, int number3, int number4) {
        //write some code here
        return (((double) sum(number1, number2, number3, number4))/4);
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
