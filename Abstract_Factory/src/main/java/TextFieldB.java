public class TextFieldB extends TextField {

    public TextFieldB (String text){
        super(text);
    }

    @Override
    public void display(){
        System.out.println(text +": ..................." );
    }

    @Override public void setText(String text) {
        this.text = text;
    }
}
