public abstract class Handler {
     abstract void setNextHandler(Handler nextHandler) ;

     abstract void processMessage(Message message);

}
