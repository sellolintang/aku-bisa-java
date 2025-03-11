
import java.util.Scanner;

public class Main {

    public static User user = new User();
    public static boolean authenticated = true;
    public static String role = "user";
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (authenticated) {
            String username = scanner.next();
            String password = scanner.next();
            String peran = user.login(username, password);
            if (peran.equals("admin")) {
                role = peran;
                authenticated = true;
            }
        }
    }
}
