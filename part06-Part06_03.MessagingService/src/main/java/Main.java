import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Instantiate the Classes
        Message message1 = new Message("Bob", "Hello");
        Message message2 = new Message("Tom", "Hello");
        Message message3 = new Message("Bob", "Wazzup?");
        Message message4 = new Message("Tom", "Nuthin' much.");
        MessagingService textChat = new MessagingService();
        
        // Add Messages to the MessagingService
        textChat.add(message1);
        textChat.add(message1);
        textChat.add(message2);
        textChat.add(message3);
        textChat.add(message4);
        
        // Instantiate ArrayList and print messages
        ArrayList<Message> messages = textChat.getMessages();
        for (Message message : messages) {
            System.out.println(message);
        }
    }
}