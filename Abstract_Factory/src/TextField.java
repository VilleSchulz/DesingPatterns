abstract class TextField {
    protected String text;


    public TextField(String text) {
        this.text = text;

    }

    public abstract void display();

    public abstract void setText(String text);
}
