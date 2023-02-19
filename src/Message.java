import java.util.Date;

public class Message {
    private final String id;
    private final Date timestamp;
    private final String text;

    public Message(String text){
        this.id = new UniqueIdGenerator().generateUniqueId();
        this.timestamp = new Date();
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getText() {
        return text;
    }
}
