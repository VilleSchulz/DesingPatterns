public class ButtonA extends Button {
    public ButtonA(String text){
    super(text);
    }

    @Override
    public void display(){

        System.out.print("("+text+")         ");
    }
    @Override public void setText(String text) {
        this.text = text;
    }
}
