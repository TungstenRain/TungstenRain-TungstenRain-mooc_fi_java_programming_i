/**
 * PaymentCard Class
 * @author frank
 */
public class PaymentCard {
    // Class variables
    private double balance;    
    
    // Constructors
    /**
     * Constructor with no parameters sets the balance to 0
     */
    public PaymentCard() {
        balance = 0.0;
    }
    
    /**
     * Constructor sets the balance to a user-defined opening balance
     * @param openingBalance double: the opening balance
     */
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    
    // Methods
    /**
     * Tells the balance of the Payment card
     * @return String: "The card has a balance of [balance] euros"
     */
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
    
    /**
     * Subtract 2.60 euros from the account if it doesn't reduce the balance below zero
     */
    public void eatAffordably() {
        if (balance - 2.60 >= 0) {
            balance-= 2.60;
        }
    }
    
    /**
     * Subtract 4.60 euros from the account if it doesn't reduce the balance below zero
     */
    public void eatHeartily() {
        if (balance - 4.60 >= 0) {
            balance-= 4.60;
        }
    }
    
    /**
     * Adds money to the card. The balance cannot exceed 150.
     * @param amount double: the amount to add
     */
    public void addMoney(double amount) {
        if (amount < 0) {
            return;
        }
        if (balance + amount <= 150) {
            balance += amount;
        } else {
            balance = 150.0;
        }
    }
}
