public class TextFieldB extends TextField {
    String text;
    String style = "!"+text+               "!";
public TextFieldB (String text){
    this.text = text;
}

    @Override
    public String display(){

        return this.style;
    }
}
