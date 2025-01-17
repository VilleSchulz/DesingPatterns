public class TextFieldA extends TextField {
    String text;
    String style = "!"+text+               "!";
    public TextFieldA (String text){
        this.text = text;
    }

    @Override
    public String display(){

        return this.style;
    }
}
