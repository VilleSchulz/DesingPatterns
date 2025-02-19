public class CompensationHandler extends Handler {
public CompensationHandler(){
    super.messageType = MessageType.COMPENSATION_CLAIM;
}




public void setNextHandler(Handler handler){
        super.nextHandler = handler;
    }
    @Override
    public void processMessage(Message message){
        if(message.messageType == messageType){
            System.out.println("Compensation Handler in work:");
            System.out.println("Compensation Handler: " + message.messageContent);
            System.out.println("Compensation Handler: " + message.senderEmail);
        }else{

            if(nextHandler != null){
                nextHandler.processMessage(message);
            }
        }
    }
}
