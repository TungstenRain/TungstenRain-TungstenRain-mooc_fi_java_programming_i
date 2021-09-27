/**
 * A program to demonstrate debt accumulation using the Debt class
 * 
 * @author frank
 */
public class Main {

    public static void main(String[] args) {
        // Instantiate the Debt class
        Debt mortgage = new Debt(120000.0, 1.01);
        
        // Print the account balance
        mortgage.printBalance();

        // Increment the balance by one year and display the results
        mortgage.waitOneYear();
        mortgage.printBalance();
        
        // Increment by 20 more years and display the results
        int years = 0;
        
        while (years < 20) {
            mortgage.waitOneYear();
            years++;
        }
        
        // Display the results
        mortgage.printBalance();
    }
}
