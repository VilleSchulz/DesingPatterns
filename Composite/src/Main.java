public class Main {


    public static void main (String [] args){
        OrganizationComponent department1 = new Department("Department 1");
        OrganizationComponent department2 = new Department("Department 2");
        OrganizationComponent employee1 =   new Employee("Employee 1", 1000);
        OrganizationComponent employee2  =  new Employee("Employee 2", 2000);
        department1.add(department2);
        department1.add(employee1);
        department2.add(employee2);

        System.out.println("Total salary is " + department1.getTotalSalary());

        System.out.println("Structure of organization is : \n "+ department1.toXML());



    }
}
