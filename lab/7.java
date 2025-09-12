import java.util.Scanner;

class Employee {
    private int ID;
    private String name;
    private String department;
    private double salary;

    public Employee() {
        // Default constructor
    }

    public Employee(int ID, String name, String department, double salary) {
        this.ID = ID;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void setDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        this.ID = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter employee name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter employee department: ");
        this.department = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        this.salary = scanner.nextDouble();
    }

    public void showDetails() {
        System.out.println("Employee ID: " + this.ID);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Department: " + this.department);
        System.out.println("Employee Salary: " + this.salary);
    }
}
class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setDetails();
        System.out.println("\nEmployee Details:");
        employee.showDetails();
    }
}
