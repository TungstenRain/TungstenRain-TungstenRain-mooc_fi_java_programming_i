
public class PaymentTerminal {
    // Variables
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    
    // Constructors
    /**
     * Construct the PaymentTerminal with initial amount of 1000 euros, no 
     * affordable meals sold, and no hearty meals sold
     */
    public PaymentTerminal() {
        money = 1000;
        affordableMeals = 0;
        heartyMeals = 0;
    }
    
    // Methods
    /**
     * Eat an affordable meal
     * Accept payment and increase the amount in the terminal by the payment amount.
     * If the payment amount is less than 2.5 euros the transaction fails and
     * the payment returned to the customer
     * 
     * @param payment double: the payment made by the student
     * @return double: any change left over from the transaction
     */
    public double eatAffordably(double payment) {
        if (payment >= 2.5) {
            money+= 2.5;
            affordableMeals++;
            return payment - 2.5;
        }
        return payment;
    }
    /**
     * Eat an affordable meal with a payment card
     * Accept payment and increase the amount in the terminal by 2.5. If the card
     * doesn't have 2.5 the transaction fails.
     * 
     * @param card PaymentCard: the paymentCard used for the transaction
     * @return boolean: true if successful; false otherwise
     */
    public boolean eatAffordably(PaymentCard card) {
        if (card.takeMoney(2.5)) {
            affordableMeals++;
            return true;
        }
        return false;
    }
    
    /**
     * Eat a healthy meal
     * Accept payment and increase the amount in the terminal by the payment amount.
     * If the payment amount is less than 4.3 euros the transaction fails and
     * the payment returned to the customer
     * 
     * @param payment double: the payment made by the student
     * @return double: any change left over from the transaction
     */
    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= 4.3) {
            money+= 4.3;
            heartyMeals++;
            return payment - 4.3;
        }
        return payment;
    }
    
    /**
     * Eat a healthy meal
     * Accept payment and increase the amount in the terminal by 4.3. If the card
     * doesn't have 4.3 the transaction fails.
     * 
     * @param card PaymentCard: the paymentCard used for the transaction
     * @return boolean: true if successful; false otherwise
     */
    public boolean eatHeartily(PaymentCard card) {
        if (card.takeMoney(4.3)) {
            heartyMeals++;
            return true;
        }
        return false;
    }
    
    /**
     * Add money to the payment card. This amount is also added to the money
     * available in the terminal
     * @param card PaymentCard: the card to have money added to
     * @param sum double: the amount to be added to the card
     */
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            money+= sum;
        }
    }

    @Override
    /**
     * Return a String in the following format
     * money [money], number of sold affordable meals: [affordableMeals], number of sold hearty meals: [heartyMeals]
     */
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
