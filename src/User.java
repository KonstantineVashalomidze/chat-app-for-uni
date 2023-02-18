

public class User {
    private final String id;
    private final String username;
    private final String password;
    private final String email;

    public User(String username, String email, String password){
        this.id = new UniqueIdGenerator().generateUniqueId();
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // getters
    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

}
