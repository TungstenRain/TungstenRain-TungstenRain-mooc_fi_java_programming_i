
import java.util.Objects;

public class Message {
    // Variables
    private String sender;
    private String content;
    
    // Constructors
    /**
     * Construct the Message
     * @param sender
     * @param content 
     */
    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }
    
    // Methods
    /**
     * Get the sender
     * @return String: the sender
     */
    public String getSender() {
        return sender;
    }
    
    /**
     * Get the content
     * @return String: the content
     */
    public String getContent() {
        return content;
    }
    
    /**
     * Return the Message
     * @return String: in the following format
     * [sender]: [content]
     */
    public String toString() {
        return this.sender + ": " + this.content;
    }

    // created using the "insert code" feature of NetBeans
    @Override
    /**
     * Determine if this equals an object
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Message other = (Message) obj;
        if (!Objects.equals(this.sender, other.sender)) {
            return false;
        }
        if (!Objects.equals(this.content, other.content)) {
            return false;
        }
        return true;
    }

}
