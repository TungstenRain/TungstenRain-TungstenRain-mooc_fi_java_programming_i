import java.util.Objects;

public class Money {
    // Variables
    private final int euros;
    private final int cents;
    
    // Constructors
    /**
     * Construct the Money class
     * @param euros int: the amount of euros
     * @param cents int: the amount of cents
     */
    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }
    
    // Methods
    /**
     * Get the amount of euros
     * @return int: the amount of euros
     */
    public int euros() {
        return this.euros;
    }
    /**
     * Get the amount of cents
     * @return int: the amount of cents
     */
    public int cents() {
        return this.cents;
    }
    
    /**
     * Add money to this
     * @param addition Money: the Money to be added
     * @return Money: the sum of the two Money classes
     */
    public Money plus(Money addition) {
        Money addMoney = new Money(this.euros, this.cents);
        if (addition.euros >= 0 && addition.cents >= 0) {
            // Initialize variables
            int addCents = this.cents + addition.cents;
            int addEuros = this.euros + addition.euros;
            
            if (addCents > 99) {
                addEuros = addEuros + (addCents / 100);
                addCents = addCents % 100;
            }
            addMoney = new Money(addEuros, addCents);
        }
        return addMoney;
    }
    
    /**
     * Subtract money from this
     * @param subtraction Money: the Money to be subtracted
     * @return Money: the difference of the two Money classes
     * (Note: if the subtraction amount is greater than this, this will return Money with 0 euros and 0 cents)
     */
    public Money minus(Money subtraction) {
        Money subtractMoney = new Money(this.euros, this.cents);
        
        // Determine if this is less than the amount to be subtracted.
        // If less than return 0.
        if (this.lessThan(subtraction)) {
            subtractMoney = new Money(0, 0);
            return subtractMoney;
        }
        if (subtraction.euros >= 0 && subtraction.cents >= 0) {
            // Initialize variables
            int subtractCents = this.cents - subtraction.cents;
            int subtractEuros = this.euros - subtraction.euros;
            
            if (subtractCents < 0) {
                subtractCents = 100 - Math.abs(subtractCents);
                subtractEuros--;
            }
            subtractMoney = new Money(subtractEuros, subtractCents);
        }
        return subtractMoney;
    }
    
    /**
     * Determine if this is equal to another Object
     * @param compared Object: the object to compare
     * @return boolean: true if equal; false otherwise
     */
    public boolean equals(Object compared) {
        // if the variables reference the same location, they are equal
        if (this == compared) {
            return true;
        }
        
        // if compared is not an instance of Money, they are not equal
        if (!(compared instanceof Money)) {
            return false;
        }
        
        // Cast the compared into Money and compare variables
        Money comparedMoney = (Money) compared;
        return (this.euros == comparedMoney.euros
                && this.cents == comparedMoney.cents);
    }
    
    /**
     * Determine if this is less than another Money amount
     * @param compared Money: the Money to compare
     * @return boolean: true if this is less than the compared amount; false otherwise
     */
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }
    
    @Override
    /**
     * Return a String in the following format:
     * [euros].[cents]
     */
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
