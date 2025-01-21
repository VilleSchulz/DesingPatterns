

public abstract class OrganizationComponent {
    final protected String name;
    final protected int salary;

    public OrganizationComponent(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public OrganizationComponent(String name) {
        this.name = name;
        this.salary = 0;
    }

    public abstract void add(OrganizationComponent organizationComponent);

    public abstract void remove(OrganizationComponent organizationComponent);

    public abstract int getTotalSalary();

    public abstract OrganizationComponent getChild();
    public abstract String toXML();
}



