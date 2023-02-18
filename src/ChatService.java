import java.util.List;

public interface ChatService {
    // sends message from one user to another
    void sendMessage(Message message);

    // returns a list of all public questions
    List<PublicQuestion> getPublicQuestions();

    // adds a new public question to the list
    void addPublicQuestion(PublicQuestion publicQuestion);

    // rate public question
    void ratePublicQuestions(PublicQuestion publicQuestion, double rating);

}
