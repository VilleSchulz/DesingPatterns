import java.util.ArrayList;
import java.util.List;

public class Computer {
    String name;
    private List<Component> components;
    /*String processor;
    int ram;
    int hardDrive;
    String operationSystem;
    String graphicsCard;
    int powerSupply;*/

    public Computer() {
        this.components = new ArrayList<>();
    }

    public void addComponent(Component component) {
        components.add(component);

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name+ ":\n");

        {
            for (Component component : components) {
                sb.append(component.getDetails());
                sb.append("\n");


            }
            return sb.toString();

        }

    }
    public void setName(String name){
        this.name = name;
    }


}
