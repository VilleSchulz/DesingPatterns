public class GeneralFeedbackHandler extends Handler {
    MessageType messageType = MessageType.GENERAL_FEEDBACK;
    Handler nextHandler;

    public GeneralFeedbackHandler(){

    }

    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }


    @Override
    public void processMessage(Message message){


    }

}
