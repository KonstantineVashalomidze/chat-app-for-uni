import java.util.Date;

public class Message {
    private final String id;
    private final User sender;
    private final User receiver;
    private final Date timestamp;

    public Message(User sender, User receiver){
        this.id = new UniqueIdGenerator().generateUniqueId();
        this.sender = sender;
        this.receiver = receiver;
        this.timestamp = new Date();
    }

    public String getId() {
        return id;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public Date getTimestamp() {
        return timestamp;
    }

}
