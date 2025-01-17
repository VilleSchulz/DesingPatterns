public class ButtonA extends Button {
    String style;
    public ButtonA(){
        this.style = "(+)";
    }

    @Override
    public String display(){

        return style;
    }
}
