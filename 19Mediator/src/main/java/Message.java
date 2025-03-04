import java.util.Date;

public class Message {

    private User user;
    private  String message;
    private Date date;


    public Message(User user, String message, Date date) {
        this.user = user;
        this.message = message;
        this.date = date;

    }


    public Date getDate() {
        return date;
    }

    public User getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }





}
