public class GeneralFeedbackHandler extends Handler {

    public GeneralFeedbackHandler(){
        super.messageType = MessageType.GENERAL_FEEDBACK;

    }

    public void setNextHandler(Handler handler){
        super.nextHandler = handler;
    }


    @Override
    public void processMessage(Message message){
        if(message.messageType == this.messageType){
            System.out.println("General Feedback handler in work:");
            System.out.println("General Feedback Handler: " + message.messageContent);
            System.out.println("General Feedback Handler: " + message.senderEmail);
        }else{

            if(nextHandler != null){
                nextHandler.processMessage(message);
            }
        }


    }

}
