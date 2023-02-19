import java.util.ArrayList;
import java.util.List;

public class ChatRoom{

    private List<User> chatRoomHasUsers = new ArrayList<>();

    private List<String> chatRoomHistory = new ArrayList<>();

    private final String name;

    ChatRoom(String name){
        this.name = name;
    }

    public void addMessageToChatRoomHistory(User fromUser, Message message){
        this.chatRoomHistory.add(fromUser.getUsername() + ": " + message.getText());
    }

    public void addUserInChatroom(User user){
        this.chatRoomHasUsers.add(user);
    }

    public void removeFromChatRoom(User user){
        this.chatRoomHasUsers.remove(user);
    }

    public void printChatMembers(){
        System.out.println(this.name + " chat have users: ");
        for (User member : this.chatRoomHasUsers){
            System.out.println("            " + member.getUsername());
        }
    }





    public String getName() {
        return name;
    }

    public List<User> getChatRoomUsers(){
        return this.chatRoomHasUsers;
    }

    public User getAdmin() {
        if (this.chatRoomHasUsers != null){
            return this.chatRoomHasUsers.get(0);
        }
        return null;
    }
}
