/**
 * Stars Class for 
 * @author frank
 */
public class Stars {
    // Methods
    /**
     * Print a number of stars
     * @param numberOfStars 
     */
    private static void printStars(int numberOfStars) {
        for (int i = 0; i < numberOfStars; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }
    
    /**
     * Print a grade distribution dependent
     * Prints in the following format:
     * [array length - 1]: [number of grades]
     * [array length - 2]: [number of grades]
     * ...
     * [array length = 0]: [number of grades]
     * @param grades int[]: an array of the number of grades at a particular level
     */
    public static void printGradeDistribution(int[] grades) {
        System.out.println("Grade distribution:");
        for (int i = grades.length-1; i >= 0; i--) {
            System.out.print(i + ": ");
            printStars(grades[i]);
        }
    }    
}
