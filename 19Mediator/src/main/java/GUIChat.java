import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class GUIChat extends Application {
    TextArea chatArea;
    TextField textField;
    List<User> users;
    List<Message> messages;
    IChat chat;
    User currentUser;


    public GUIChat(IChat chat) {
        this.chat = chat;
        messages = new ArrayList<Message>();
        users = new ArrayList<User>();
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        textField = new TextField();
        chatArea = new TextArea();
        chatArea.setEditable(false);
        Button send = new Button("Send");
        HBox sendBox = new HBox();
        sendBox.getChildren().addAll(textField, send);
        root.setCenter(chatArea);
        root.setBottom(sendBox);

        //this sends message to chat
        send.setOnAction(e -> {
            //calls user to send message
            currentUser.sendMessage(textField.getText());
            textField.clear();

        });
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Chat Room: " + chat.getName() + " User: " + currentUser.getName());
        primaryStage.show();


    }

    //this set user for gui
    public void setUser(User user) {
        currentUser = user;
        users.add(currentUser);

    }

    //this updates chat for user
    public void updateChat(Message newMessage) {
        String formattedMessage = "(" + newMessage.getDate() + ") " +
                "[" + newMessage.getUser().getName() + "]: " + newMessage.getMessage() + "\n";
        chatArea.appendText(formattedMessage);
    }

}



