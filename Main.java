package comDemo3;

public class Main {

    public static void main(String[] args) {
        try {
            String token = login("admin", "pass");
            System.out.println("Token: " + token);
        }catch (Exception e){
            System.out.println("输出错误");
        }
    }

    static String login(String username, String password) {
        if (username.equals("admin")) {
            if (password.equals("password")) {
                return "xxxxxx";
            } else {
                // 抛出LoginFailedException:
                throw new LoginFailedException("Bad username or password.");
            }
        } else {
            // 抛出UserNotFoundException:
            throw new UserNotFoundException("User not found.");
        }
    }
}