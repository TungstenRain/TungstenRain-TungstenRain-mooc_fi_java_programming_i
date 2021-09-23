/**
 * Part 1: Define a method called printSpaces(int number) that produces the 
 * number of spaces specified by number. The method does not print the line 
 * break.
 * 
 * Part 2: Create a method called printTriangle(int size) that uses 
 * printSpaces and printStars to print the correct triangle. 
 * 
 * Part 3: Define a method called christmasTree(int height) that prints the 
 * correct Christmas tree. The Christmas tree consists of a triangle with the 
 * specified height as well as the base. The base is two stars high and three 
 * stars wide, and is placed at the center of the triangle's bottom. The tree 
 * is to be constructed by using the methods printSpaces and printStars.
 * 
 * @author frank
 */
public class AdvancedAstrology {

    /**
     * Print the number of given stars
     * @param number int
     */
    public static void printStars(int number) {
        // Loop to count out stars
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    /**
     * Print the number of given spaces
     * @param number int
     */
    public static void printSpaces(int number) {
        // Loop to count out stars
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    /**
     * Print a right-leaning triangle with a given size
     * @param size int
     */
    public static void printTriangle(int size) {
        // Loop through to create the right-leaning triangle
        for (int i = 1; i <= size; i++) {
            // Determine number of spaces
            int space = size - i;
            printSpaces(space);
            printStars(i);
        }
    }

    /**
     * Print a Christmas tree using stars for a given height
     * The number of spaces to the left of the tree = (height -1) - i
     * The number of stars = (i * 2) +1
     * The base spaces = (height - 2)
     * 
     * @param height int
     */
    public static void christmasTree(int height) {
        // Initialize variables
        int spaces = 0;
        int stars = 0;
        
        // Loop through to create the Christmas tree
        for (int i = 0; i < height; i++) {
            spaces = height - 1 - i;
            stars = (i * 2) + 1;
            printSpaces(spaces);
            printStars(stars);
        }
        for (int j = 0; j < 2; j++){
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
