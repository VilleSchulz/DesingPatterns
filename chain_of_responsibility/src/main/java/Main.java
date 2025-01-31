
public class Main {

    public static void main(String[] args){
        Handler primaryHandler;
        Handler GenralFeedbackHandler = new GeneralFeedbackHandler();
        Handler DevelopmentHandler = new DevelopmentHandler();
        Handler ContactHandler = new ContactHandler();
        Handler CompensationHandler = new CompensationHandler();
        GenralFeedbackHandler.setNextHandler(DevelopmentHandler);
        DevelopmentHandler.setNextHandler(ContactHandler);
        ContactHandler.setNextHandler(CompensationHandler);


        primaryHandler = GenralFeedbackHandler;


        primaryHandler.processMessage(new Message(MessageType.GENERAL_FEEDBACK, "I love your product", "ASD@gmail.com"));
        primaryHandler.processMessage(new Message(MessageType.DEVELOPMENT_SUGGESTIONS, "I would like to see this feature", "ASD@gmail.com"));
        primaryHandler.processMessage(new Message(MessageType.CONTACT_REQUESTS, "I would like to talk to someone", "ASD@gmail.com"));
        primaryHandler.processMessage(new Message(MessageType.COMPENSATION_CLAIM, "I want my money back", "ASD@gmail.com"));


    }


}
