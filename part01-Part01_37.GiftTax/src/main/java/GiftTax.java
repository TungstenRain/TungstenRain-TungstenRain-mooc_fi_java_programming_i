
import java.util.Scanner;

public class GiftTax {

    /**
     * Calculate the tax
     * @param lowerLimit, int: lower limit of taxable rate
     * @param taxAtLowerLimit, int: tax at lower limit
     * @param giftValue, int: value of the gift
     * @param taxRate, double: tax rate
     * @return double: the tax amount
     */
    private static double calculateTax(int lowerLimit, int taxAtLowerLimit, int giftValue, double taxRate) {
        /**
         * Tax = Tax at lower limit + (Value of Gift - Lower Limit of Taxable Rate) * Tax Rate
         */
        return ((double) taxAtLowerLimit + ((double) giftValue - lowerLimit)*taxRate);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Request and capture user information
        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());
        
        // Determine tax
        /**
         * Value of gift    Tax at the lower limit  Tax rate
         * 5000-25000       100                     8
         * 25000-55000      1700                    10
         * 55000-200000     4700                    12
         * 200000-1000000   22100                   15
         * 1000000+         142100                  17
         */
        if (giftValue < 5000) {
            System.out.println("No tax!");
        } else if (giftValue >= 5000 && giftValue < 25000) {
            System.out.println("Tax: " + calculateTax(5000, 100, giftValue, 0.08));
        } else if (giftValue >= 25000 && giftValue < 55000) {
            System.out.println("Tax: " + calculateTax(25000, 1700, giftValue, 0.10));
        } else if (giftValue >= 55000 && giftValue < 200000) {
            System.out.println("Tax: " + calculateTax(55000, 4700, giftValue, 0.12));
        } else if (giftValue >= 200000 && giftValue < 1000000) {
            System.out.println("Tax: " + calculateTax(200000, 22100, giftValue, 0.15));
        } else {
            System.out.println("Tax: " + calculateTax(1000000, 142100, giftValue, 0.17));
        }
    }
}
