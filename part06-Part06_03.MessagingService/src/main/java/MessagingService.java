/**
 * MessagingService Class for Part06_03
 * @author frank
 */
import java.util.ArrayList;

public class MessagingService {
    // Variables
    private ArrayList<Message> messages;
    
    // Constructors
    /**
     * Construct the MessagingService
     */
    public MessagingService() {
        this.messages = new ArrayList<>();
    }
    
    // Methods
    /**
     * Add a message to the service as long as it is 280 characters or less.
     * @param message Message: the message to be added
     */
    public void add(Message message) {
        if (message.getContent().length() > 280) {
            return;
        }
        if (!messages.contains(message)) {
            messages.add(message);
        }
    }
    
    /**
     * Get the messages
     * @return ArrayList<Message>: the messages in the MessagingService
     */
    public ArrayList<Message> getMessages() {
        return messages;
    }
}
