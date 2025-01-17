public class ButtonB extends Button {
    String style;

    public ButtonB(String text) {
        this.style = "[" + text + "]";
    }


    @Override
    public String display() {

        return this.style;
    }
}
