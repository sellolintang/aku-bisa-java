
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
        usersList.add(user1);
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
    public boolean login(String username, String password) {
        for (User tempUser : usersList) {
            if (tempUser.getUsername().equals(username) && tempUser.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    // Method logout
    public boolean logout() {
        return true;
    }
}
