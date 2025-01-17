public class CheckboxA extends Checkbox {
    String style;
    public CheckboxA(){
        this.style = "[ ]";


    }
    @Override
    public String display(){

        return style;
    }
}
