import java.sql.SQLOutput;

public class DevelopmentHandler extends Handler {

    public DevelopmentHandler() {
        super.messageType = MessageType.DEVELOPMENT_SUGGESTIONS;
    }
    public void setNextHandler(Handler handler) {
        super.nextHandler = handler;
    }

    @Override
    public void processMessage(Message message) {
        if (message.messageType == this.messageType) {
            System.out.println("Development Handler in work:");
            System.out.println("Development Handler: " + message.messageContent);
            System.out.println("Development Handler: " + message.senderEmail);
        } else {

            if (nextHandler != null) {
                nextHandler.processMessage(message);
            }


        }

    }

}
