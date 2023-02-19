import java.util.ArrayList;
import java.util.List;

public class ChatRoom{

    private List<User> chatRoomHasUsers = new ArrayList<>();

    private List<String> chatRoomHistory = new ArrayList<>();

    private final String name;

    private final User admin;


    ChatRoom(String name, User admin){
        this.name = name;
        this.admin = admin;
        this.chatRoomHasUsers.add(admin);
    }

    public void addMessageToChatRoomHistory(User fromUser, Message message){
        this.chatRoomHistory.add(fromUser.getUsername() + ": " + message.getText());
    }

    public void members(){
        for (User member : this.chatRoomHasUsers){
            System.out.println(member.getUsername());
        }
    }



    public void addUserInChatRoom(User user){
        this.chatRoomHasUsers.add(user);
    }




    public String getName() {
        return name;
    }

    public List<User> getChatRoomUsers(){
        return this.chatRoomHasUsers;
    }

}
