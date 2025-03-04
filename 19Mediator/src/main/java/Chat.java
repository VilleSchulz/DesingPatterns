import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Chat  implements IChat{

    List<User> users;
    List<Message> messages;
    String name;
    //GUIChat chatGUI;

    public Chat(String name) {
        this.name = name;
        messages = new ArrayList<Message>();
        users = new ArrayList<User>();



    }


    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public List<User> getUsers() {
        return users;
    }



    //this send message to aall users in the chat
    public void receiveMessage(User user, String message) {
        Message newMessage = new Message(user, message, new Date());
        messages.add(newMessage);
        for(User u: users){
            u.receiveMessage(newMessage);

        }
    }

    public String getName() {
        return name;

    }


}
