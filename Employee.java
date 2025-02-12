class Employee {
    int employeeID;
    String name;
    String department;
    private double salary; 

    static int totalEmployees = 0; 

    Employee() {
        employeeID = 0;
        name = "Unknown";
        department = "None";
        salary = 0.0;
        totalEmployees++;
    }

    Employee(int employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public double calculateSalary() {
        return salary;
    }

    void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(101, "Lucky", "IT", 50000);
        Employee emp3 = new Employee(102, "Lovenesh", "HR", 45000);

        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
        emp3.displayEmployeeInfo();

        Employee.displayTotalEmployees();

        System.out.println("Employee 2 Salary: $" + emp2.calculateSalary());
        System.out.println("Employee 3 Salary: $" + emp3.calculateSalary());
    }
}
