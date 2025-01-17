public class BFactory extends UIFactory {
    ButtonB buttons [];
    CheckboxB checkboxes[];
    TextFieldB textfields [];
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
            textfields[i] = new TextFieldB(signupText[i]);
        }
        //generate buttons
        for(int i = 0; i < 2;i++){
            buttons[i] = new ButtonB(buttonText[i]);
        }

    }

    private void generateLogin() {

        //generate textfields
        for(int i = 0; i < 5;i++){
            textfields[i] = new TextFieldB(loginText[i]);
        }

        //generate buttons
        for(int i = 0; i < 2;i++){
            buttons[i] = new ButtonB(buttonText[i]);
        }
    }



}
