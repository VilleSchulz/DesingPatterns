public class CheckboxB extends Checkbox  {
    String style;
    public void CheckboxA(){
        this.style = "{ }";
    }
    @Override
    public String display(){

        return style;
    }
}
