import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    private static List<User> users;

    static {
        users = new ArrayList<User>();
        User user = new User("user", "user");
        User user1 = new User("user", "user");
        users.add(user);
        users.add(user1);

    }

    public static Optional<User> getUserByCredentials(String username, String password) {
        return users.stream()
                .filter(u -> u.getUserName().equals(username) &&
                        u.getPassword().equals(password))
                .findFirst();
    }
}
