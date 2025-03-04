import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;


public class GUIStart extends Application {

    List<IChat> chats = new ArrayList<>();
    IChat currentChat;
    User currentUser;
    Label chatLabel;
    TextField nameField;
    Stage newWindow;
    TextField chatName;

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        nameField = new TextField();
        Button register = new Button("Register");
        chatName = new TextField();
        //Hbox for chat name
        HBox chatBox = new HBox();
        chatLabel = new Label("Chat Room");
        chatBox.getChildren().addAll(chatLabel, chatName);
        //Hbox for username
        HBox usersBox = new HBox();
        Label usersLabel = new Label("Username");
        //Vbox for chat and username
        usersBox.getChildren().addAll(usersLabel, nameField);
        VBox vbox = new VBox();
        vbox.getChildren().addAll(usersBox, chatBox, register);
        root.setCenter(vbox);



        //register button for opening chat
        register.setOnAction(e -> {
            register();

        });

        //set scene start screen
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mediator Example");
        primaryStage.show();


    }

    //register user and open chat window
    public void register(){
        //create new chat window GUI and stage
        newWindow = new Stage();
        boolean chatExists = false;

        //check if chat allready exists
        for (IChat chat : chats) {
            if (chat.getName().equals(chatName.getText())) {
                currentChat = chat;
                chatExists = true;
            }
        }
        //create new chat if it does not exist
        if (!chatExists) {
            IChat newChat = new Chat(chatName.getText());
            currentChat = newChat;
            chats.add(newChat);
        }



        //start chat window
        try {
            //create new chat window
            GUIChat GUI = new GUIChat(currentChat);
            //create new user and add to chat
            currentUser = new User(nameField.getText(), currentChat, GUI);
            currentChat.addUser(currentUser);
            //set user and chat to GUI
            GUI.setUser(currentUser);
            GUI.start(newWindow);
        } catch (Exception ex) {
            ex.printStackTrace();
        }



    }
}
