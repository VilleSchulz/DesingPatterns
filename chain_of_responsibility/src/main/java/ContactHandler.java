public class ContactHandler extends Handler {


    public ContactHandler(){
        super.messageType = MessageType.CONTACT_REQUESTS;
    }
    public void setNextHandler(Handler handler){
        super.nextHandler = handler;
    }
    @Override public void processMessage(Message message){

        if(message.messageType == this.messageType){
            System.out.println("Contact Handler in work:");
            System.out.println("Contact Handler: " + message.messageContent);
            System.out.println("Contact Handler: " + message.senderEmail);
        }else{
            if(nextHandler != null){
                nextHandler.processMessage(message);
            }
        }
    }


}
