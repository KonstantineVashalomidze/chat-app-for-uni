public class LoginForm {

    LoginForm(String email, String username, String password){


        MySQLChatService.getInstance().loginUser(email, username, password);

    }

}
