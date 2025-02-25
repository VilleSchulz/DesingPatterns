public class Component {
    String name;
    int amount;

    public Component(String name, int amount) {
        this.name = name;
        this.amount = amount;


    }

    String getDetails(){
        return amount+" "+name;
    }

}
