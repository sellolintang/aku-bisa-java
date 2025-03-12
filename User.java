
import java.util.ArrayList;

public class User {

    private String username;
    private String password;
    private String role;
    private static ArrayList<User> usersList = new ArrayList();

    public void inisiate() {
        User user1 = new User();
        user1.setUsername("nugi");
        user1.setPassword("123");
        user1.setRole("admin");
        User user2 = new User();
        user2.setUsername("farrel");
        user2.setPassword("sello");
        user2.setRole("operator");
        usersList.add(user1);
        usersList.add(user2);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Method login
    public String login(String username, String password) {
        String peran = "";
        for (User tempUser : usersList) {
            if (tempUser.getUsername().equals(username) && tempUser.getPassword().equals(password)) {
                peran = tempUser.getRole();
                break;
            }
        }
        return peran;
    }

    // Method logout
    public boolean logout() {
        return true;
    }
}
