public class Main {

    public static void main(String[] args) {
        // Instantiate the Classes
        Gift gift1 = new Gift("Book 1", 1);
        Gift gift2 = new Gift("Book 1", 1);
        Gift gift3 = new Gift("Book 2", 5);
        Gift gift4 = new Gift("Book 3", 4);
        Package sack = new Package();
        
        // Add gifts to the package
        sack.addGift(gift1);
        sack.addGift(gift2);
        sack.addGift(gift3);
        sack.addGift(gift4);
        
        System.out.println(sack.totalWeight());
    }
}
