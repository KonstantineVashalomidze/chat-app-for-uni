import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class User{
    private final String id;
    private final String username;
    private final String password;
    private final String email;
    private List<ChatRoom> chatRooms = MySQLChatService.getInstance().getAllChatRoomThatExists();



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

    public void sendMessageTo(User user, Message message){



    }


    // add user in chat room
    public void joinInChatRoom(ChatRoom chatRoom) {
        chatRoom.addUserInChatroom(this);
        this.chatRooms.add(chatRoom);
        System.out.println(this.username + " has joined in the chat room: " + chatRoom.getName());
    }

    public void leaveChatRoom(ChatRoom chatRoom) {
        chatRoom.removeFromChatRoom(this);
        this.chatRooms.remove(chatRoom);
        System.out.println(this.username + " has left the chat room: " + chatRoom.getName());
    }




    public void createChatRoom(String name){
        ChatRoom tempChatRoom = new ChatRoom(name);
        tempChatRoom.addUserInChatroom(this);
        this.chatRooms.add(tempChatRoom);
        System.out.println("chatroom: " + name + " has created by: " + this.username);
    }

    public ChatRoom getChatRoomByName(String name){
        for (ChatRoom chatRoom : this.chatRooms){
            if (chatRoom.getName().equals(name)){
                return chatRoom;
            }
        }
        return null;
    }





}
