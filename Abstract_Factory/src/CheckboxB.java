public class CheckboxB extends Checkbox  {
    public CheckboxB(String text) {
        super(text);
    }


    @Override
    public void display(){
        System.out.println(text+" { }");
    }@Override public void setText(String text) {
        this.text = text;
    }

}
