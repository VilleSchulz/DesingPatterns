public class CompensationHandler extends Handler {
    MessageType messageType = MessageType.COMPENSATION_CLAIM;
    Handler nextHandler;


public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }
    @Override
    public void processMessage(Message message){
        if(message.messageType == messageType){
            System.out.println("Compensation Handler: " + message.messageContent);
        }else{
            System.out.println("Compensation Handler: This message is not for me");
            if(nextHandler != null){
                nextHandler.processMessage(message);
            }
        }
    }
}
