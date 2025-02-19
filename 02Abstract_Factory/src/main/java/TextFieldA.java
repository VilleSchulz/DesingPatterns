public class TextFieldA extends TextField {


    public TextFieldA (String text){
        super(text);
    }

    @Override
    public void display() {
        System.out.println(text +": __________________________" );
    }
    @Override public void setText(String text) {
        this.text = text;
    }
}
