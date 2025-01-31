public class Message {
    MessageType messageType;
    String messageContent;
    String senderEmail;

    public Message(MessageType messageType,String messageContent,String senderEmail){
        this.messageType = messageType;
        this.messageContent = messageContent;
        this.senderEmail = senderEmail;
    }
}
