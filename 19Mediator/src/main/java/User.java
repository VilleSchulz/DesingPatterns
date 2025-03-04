public class User{
    private String username;
    private IChat chat;
    private GUIChat GUI;


    public User(String username,  IChat chat, GUIChat GUI) {
        this.GUI = GUI;


        this.username = username;
        this.chat = chat;

    }
    //send message to chat backend
    public void sendMessage(String message) {
        chat.receiveMessage(this, message);

    }


    public String getName() {
        return username;
    }


    public void receiveMessage(Message newMessage) {
        GUI.updateChat(newMessage);

    }


}
