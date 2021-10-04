
public class PaymentCard {
    // Variables
    private double balance;
    
    // Constructors
    /**
     * Construct the PaymentCard
     * @param balance double: the balance on the card
     */
    public PaymentCard(double balance) {
        this.balance = balance;
    }
    
    // Methods
    /**
     * Get the balance of the card
     * @return double: the card's balance
     */
    public double balance() {
        return this.balance;
    }
    
    /**
     * Add money to the card
     * @param increase double: the amount to increase the balance by
     */
    public void addMoney(double increase) {
        if (increase > 0) {
            this.balance += increase;
        }
    }
    
    /**
     * Take a given amount from the balance of the card
     * If the amount is more than the balance, the transaction fails and this returns false; otherwise true.
     * @param amount double: the amount to reduce the balance by
     * @return boolean: true, if the amount is able to reduce and is reduced; otherwise false.
     */
    public boolean takeMoney(double amount) {
        if (balance >= amount) {
            balance-= amount;
            return true;
        } else {
            return false;
        }
    }
}
