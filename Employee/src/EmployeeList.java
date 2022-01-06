public class EmployeeList {
    public static void main(String[] args) {
        System.out.println(Employee.getNextID());

        Employee a = new Employee("John Doe");
        Employee b = new Employee("Jane Smith");
        Employee c = new Employee("Sally Brown");

        System.out.println(a.getID() + ": " + a.getName());
        System.out.println(b.getID() +": " + b.getName());
        System.out.println(c.getID() + ": " + c.getName());
    }
}
