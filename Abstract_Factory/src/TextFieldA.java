public class TextFieldA  extends TextField{
    String style;
    public TextFieldA () {
        this.style = "|               |";

    }
    @Override
    public String display(){

        return style;
    }
}
