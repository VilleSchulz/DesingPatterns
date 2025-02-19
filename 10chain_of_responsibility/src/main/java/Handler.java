public abstract class Handler {
    protected Handler nextHandler;
    protected MessageType messageType;
     abstract void setNextHandler(Handler nextHandler) ;

     abstract void processMessage(Message message);

}
