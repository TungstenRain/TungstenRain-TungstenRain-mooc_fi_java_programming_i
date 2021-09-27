/**
 * A program that creates an account with a balance of 100.0, deposits 20.0 in 
 * it, and finally prints the balance. 
 * 
 * Perform all the operations in this exact order.
 * 
 * @author frank
 */
public class YourFirstAccount {

    public static void main(String[] args) {
        // Instantiate the Account
        Account newAccount = new Account("Arto's account", 100.00);
        
        // Deposit 20.00 into the account
        newAccount.deposit(20.0);
        
        // Display account balance
        System.out.println(newAccount.toString());        
    }
}
