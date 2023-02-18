import java.util.Scanner;

public class RegistrationForm {



    RegistrationForm(String email, String username, String password, String role){

        MySQLChatService.getInstance().registerUser(email, username, password, role);

    }

}
