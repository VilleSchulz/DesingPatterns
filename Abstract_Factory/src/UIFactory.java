
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class UIFactory {
    public String[] signupText = {"Name", "Last name", "Phone", "Password"};
    public String[] loginText = {"Name", "Password"};
    static Button buttons[];
    private Checkbox checkboxes[];
    List<TextField> textFields = new ArrayList<>();
    private String formType;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UIFactory UI = null;

        //Choose formType either login or signup
        System.out.println("Which of these FORM you want to show");
        System.out.println("signup or login,");
        String formType = scanner.nextLine().toLowerCase();
        while (!formType.equals("signup") && !formType.equals("login")) {
            System.out.println("Write only ´login´ or ´signup´");
            System.out.println("Which of these FORM you want to show");
            System.out.println("signup or login");
            formType = scanner.nextLine().toLowerCase();
        }

        //Choose UI-Style
        System.out.println("Which of these UI you want to show");
        System.out.println("A or B");
        String style = scanner.nextLine().toUpperCase();
        while (!style.equals("A") && !style.equals("B")) {
            System.out.println("Which of these UI you want to show");
            System.out.println("A or B");
            style = scanner.nextLine().toUpperCase();
        }

        switch (style) {
            case "A":
                UI = new AFactory();
                break;
            case "B":
                UI = new BFactory();
                break;
        }

        UI.generateUI(formType);
    }

    // generate ui based on form type: either signup or login!
    public void generateUI(String formType) {
        if (formType.equals("signup")) {

            generateSignup();
        } else if (formType.equals("login")) {
            {
                generateLogin();
            }

        }


        //Create static buttons and checkbox
        Checkbox rememberMe = createCheckbox("remember me: ");
        Button buttonOk = createButton("Ok");
        Button buttonCancel = createButton("Cancel");


        //display content

        for (TextField textField : textFields) {
            textField.display();
        }
        rememberMe.display();
        buttonCancel.display();
        buttonOk.display();
        System.out.println();


//*************UPDATE TEXT CONTENT****************

        //update textcontent if signup
        if (formType.equals("signup")) {
            signupText[0] = "First Name";
            signupText[1] = "Surname";
            signupText[2] = "Phone Number";
            signupText[3] = "Password";
            int i = 0;
            for (TextField textField : textFields) {
                textField.setText(signupText[i]);
                i++;
            }
        }

        //Update textcontent if login
        else if (formType.equals("login")) {
            loginText[0] = "Username";
            loginText[1] = "Password";
            int i = 0;
            for (TextField textField : textFields) {
                textField.setText(loginText[i]);
                i++;
            }

        }

        //Display updated content

        System.out.println("Updated content");
        System.out.println();

        for (TextField textField : textFields) {
            textField.display();
        }
        rememberMe.display();
        buttonCancel.display();
        buttonOk.display();
        System.out.println();

//*************************************************

    }

    //This method generates the textfields for the signup form based on the given list of text
    public void generateSignup() {
        for (int i = 0; i < signupText.length; i++) {
            textFields.add(createTextField(signupText[i]));

        }

    }

    //This method generates the textfields for the login form based on the given list of text
    public void generateLogin() {
        for (int i = 0; i < loginText.length; i++) {
            textFields.add(createTextField(loginText[i]));
        }


    }


    public abstract Button createButton(String text);

    public abstract TextField createTextField(String text);

    public abstract Checkbox createCheckbox(String text);

}


