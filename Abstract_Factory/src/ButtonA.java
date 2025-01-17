public class ButtonA extends Button {
    String style;

    public ButtonA(String text){

        this.style = "("+text+")";
    }

    @Override
    public String display(){

        return this.style;
    }
}
