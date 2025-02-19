public class EmployeeTest {
    public static void main(String[] args) {
        Employee2 emp = new Employee2("John Doe", 101, 50000);
        Manager mgr = new Manager("Alice Smith", 102, 70000, "HR");

        System.out.println(emp.getName() + " Salary: " + emp.getSalary());
        emp.increaseSalary(10);
        System.out.println(emp.getName() + " New Salary: " + emp.getSalary());

        System.out.println(mgr.getName() + " (Manager, " + mgr.getDepartment() + ") Salary: " + mgr.getSalary());
    }
}