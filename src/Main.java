import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        MySQLChatService.getInstance().registerUser("k_vashalomidze@mail.ru", "Mamaafrica", "Dfa1c831b1!", "Student");
//
//        MySQLChatService.getInstance().loginUser("k_vashalomidze@mail.ru", "Mamaafrica", "Dfa1c831b1!");

        User user1 = new User("Akaki Zghuladze", "bayayi@free.uni.com", "sadasdadas");
        User user2 = new User("Boneri Javasheli", "vasomidze@mail.ru", "sadadas");
        User user3 = new User("dogma", "migagiorga@free.uni.com", "adad" );

        user1.createChatRoom("vanadzori");



        user2.joinInChatRoom(user2.getChatRoomByName("vanadzori"));
        user3.joinInChatRoom(user3.getChatRoomByName("vanadzori"));

        user3.getChatRoomByName("vanadzori").printChatMembers();



    }
}
