import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.sql.*;

public class MySQLChatService implements ChatService, Observer{

    private static MySQLChatService mySQLChatServiceInstance;

    private HashMap<User, String> users = new HashMap<>();

    private List<PublicQuestion> publicQuestions = new ArrayList<>();

    private List<Message> messageHistory = new ArrayList<>();

    private MySQLChatService(){

    }



    @Override
    public void sendMessage(Message message) {

    }

    @Override
    public List<PublicQuestion> getPublicQuestions() {
        return this.publicQuestions;
    }

    @Override
    public void addPublicQuestion(PublicQuestion publicQuestion) {

        this.publicQuestions.add(publicQuestion);

    }

    // rate question max 5.0 min 0.0
    @Override
    public void ratePublicQuestions(PublicQuestion publicQuestion, double rating) {
        if (rating >= 5.0 || rating <= 0.0){
            System.out.println("rating shoulf be in range 0.0-5.0");
            return;
        } else {
            for (PublicQuestion question : this.publicQuestions){
                question.rate(rating);
            }
        }
    }

    public void cancel() {
        System.out.println("canceled");
    }

    public void alreadyHaveAnAccount() {
        System.out.println("already have an acc");
    }

    // Register user
    public void registerUser(String email, String username, String password, String role){
        // Iterate over the keys using a for-each loop
        for (User key : this.users.keySet()) {
            if (key.getEmail().equals(email)){
                System.out.println("email already exists");
                return;
            } else if (key.getUsername().equals(username)) {
                System.out.println("username already exists");
                return;
            }
        }
        this.users.put(new User(username, email, password), role);
        System.out.println("You've successfully registered!");

    }

    // log user in
    public void loginUser(String email, String username, String password){
        // Iterate over the keys using a for-each loop
        for (User key : this.users.keySet()) {
            if (key.getEmail().equals(email) && key.getUsername().equals(username) && key.getPassword().equals(password)) {
                System.out.println("you have logged in successfully!");
                return;
            }
        }
        System.out.println("incorrect username, email or password!");

    }



    public static MySQLChatService getInstance(){
        if (mySQLChatServiceInstance == null){
            mySQLChatServiceInstance = new MySQLChatService();
        }
        return mySQLChatServiceInstance;

    }


    @Override
    public void update(String email, String username, String password) {
        System.out.println("check user");
    }

    @Override
    public void update(String email, String username, String password, String role) {
        registerUser(email, username, password, role);
    }



}
