abstract class Checkbox {
    protected String text;
    public Checkbox(String text){
        this.text = text;
    }
    public abstract void display();

    public abstract void setText(String text);
}
