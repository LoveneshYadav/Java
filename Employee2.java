class Employee2 {
    protected String name;
    protected int empid;
    protected double salary;

    public Employee2() {
        this.name = "Default";
        this.empid = 0;
        this.salary = 0.0;
    }

    public Employee2(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        this.salary += (this.salary * percentage / 100);
    }
}

class Manager extends Employee2 {
    private String department;

    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee2 emp = new Employee2("Lovenesh", 101, 500000);
        Manager mgr = new Manager("Lucky", 102, 700000, "HR");

        System.out.println(emp.getName() + " Salary: " + emp.getSalary());
        emp.increaseSalary(10);
        System.out.println(emp.getName() + " New Salary: " + emp.getSalary());

        System.out.println(mgr.getName() + " (Manager, " + mgr.getDepartment() + ") Salary: " + mgr.getSalary());
    }
}