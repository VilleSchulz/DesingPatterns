import java.sql.SQLOutput;

public class DevelopmentHandler extends Handler {
    MessageType messageType = MessageType.DEVELOPMENT_SUGGESTIONS;
    Handler nextHandler;

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void processMessage(Message message) {
        if (message.messageType == this.messageType) {
            System.out.println("Development Handler: " + message.messageContent);
            System.out.println("Development Handler: " + message.senderEmail);
        } else {
            System.out.println("Development Handler: This message is not for me");
            if (nextHandler != null) {
                nextHandler.processMessage(message);
            }


        }

    }

}
