import java.util.UUID;

public class UniqueIdGenerator {



    public String generateUniqueId() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
