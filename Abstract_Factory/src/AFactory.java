public class AFactory extends UIFactory {
    ButtonA buttons [];
    CheckboxA checkboxes[];
    TextFieldA textfields [];
    String [] signupText = {"Name","Last name","Phone","Password"};
    String [] loginText = {"Name","Password"};
    String [] buttonText = {"OK", "Cancel"};

    public void generateUI(String text){
        switch (text){
            case "SignupForm": generateSignup();
                break;
            case "LoginForm": generateLogin();
                break;
        }


    }
    private void generateSignup() {
        //generate textfields
        for(int i = 0; i < 5;i++){
            textfields[i] = new TextFieldA(signupText[i]);
        }
        //generate buttons
        for(int i = 0; i < 2;i++){
            buttons[i] = new ButtonA(buttonText[i]);
        }

    }

    private void generateLogin() {

        //generate textfields
        for(int i = 0; i < 5;i++){
            textfields[i] = new TextFieldA(loginText[i]);
        }

        //generate buttons
        for(int i = 0; i < 2;i++){
            buttons[i] = new ButtonA(buttonText[i]);
        }
    }
}





