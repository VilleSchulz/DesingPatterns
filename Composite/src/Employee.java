public class Employee extends OrganizationComponent {
    final private String name;
    final private int salary;


    public Employee(String name, int salary) {
        super(name,salary);
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException("Cannot add to an employee");
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException("Cannot remove from an employee");
    }

    @Override
    public int getTotalSalary() {
        return salary;
    }

    @Override
    public OrganizationComponent getChild() {
        return this;
    }

    @Override
    public String toXML(){
        return "<employee name = \"" + name + "\" salary = \"" + salary + "\"/> + \n";
    }
}
