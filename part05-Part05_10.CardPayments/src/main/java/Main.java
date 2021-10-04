
public class Main {

    public static void main(String[] args) {
        // Instantiate the PaymentTerminal
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);
        
        // Instantiate the PaymentCard
        PaymentCard annesCard = new PaymentCard(2);
        
        // Display the results
        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");
        
        // Attempt to process transactions and display results
        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        
        // Add money to the card
        unicafeExactum.addMoneyToCard(annesCard, 100);
        
        // Attempt to process transactions and display results
        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);
    }
}

