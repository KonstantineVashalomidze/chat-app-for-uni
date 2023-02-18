public class PublicQuestion extends Message{
    private final String id;
    private final String question;
    private final String answer;
    private double rating;


    public PublicQuestion(String question, String answer, User sender, User receiver) {
        super(sender, receiver);
        this.id = "q" + new UniqueIdGenerator().generateUniqueId();
        this.question = question;
        this.answer = answer;
    }

    public String getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public double getRating() {
        return rating;
    }

    public void rate(double rating){
        this.rating += rating;
    }
}
