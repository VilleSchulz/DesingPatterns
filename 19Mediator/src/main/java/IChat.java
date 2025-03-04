import javafx.stage.Stage;

import java.util.List;

public interface IChat {
    String getName();
    void receiveMessage(User user, String text);
    void addUser(User user);
    List<User> getUsers();
}
