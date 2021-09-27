/**
 * Debt Class for Part04_09
 * @author frank
 */
public class Debt {
    // Class variables
    private double balance;
    private double interestRate;
    
    // Constructors
    /**
     * Construct the Debt class
     * @param initialBalance double; initial balance
     * @param initialInterestRate double; initial interest rate
     */
    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }
    
    // Methods
    /**
     * Print the debt balance
     */
    public void printBalance() {
        System.out.println(balance);
    }
    
    /**
     * Increments the balance by one year by adding the accumulated interest rate
     */
    public void waitOneYear() {
        this.balance *= interestRate;
    }
    
}
