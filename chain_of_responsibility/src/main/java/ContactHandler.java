public class ContactHandler extends Handler {
    private final MessageType messageType = MessageType.CONTACT_REQUESTS;
    private Handler nextHandler;


    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }
    @Override public void processMessage(Message message){

        if(message.messageType == this.messageType){
            System.out.println("Contact Handler: " + message.messageContent);
            System.out.println("Contact Handler: " + message.senderEmail);
        }else{System.out.println("Contact Handler: This message is not for me");
            if(nextHandler != null){
                nextHandler.processMessage(message);
            }
        }
    }


}
