import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent {
    final private String name;
    List<OrganizationComponent> children = new ArrayList<>();
    public Department(String name){
        super(name);
        this.name = name;

    }



    @Override
    public int getTotalSalary(){
        int totalSalary = 0;
        for(OrganizationComponent organizationComponent : children){
            totalSalary += organizationComponent.getTotalSalary();
        }
        return totalSalary;
    }

    @Override
    public OrganizationComponent getChild() {
        return this;
    }

    @Override
    public void add(OrganizationComponent department){
        children.add(department);
    }
    @Override
    public void remove(OrganizationComponent department){
        children.remove(department);
    }
    @Override
    public String toXML(){
        StringBuilder xml = new StringBuilder();
        xml.append(("<department name = \"" + name + "\">\n"));
        for(OrganizationComponent organizationComponent:children){
            xml.append(organizationComponent.toXML());
        }
        xml.append("</department> \n");
        return xml.toString();
    }
}
