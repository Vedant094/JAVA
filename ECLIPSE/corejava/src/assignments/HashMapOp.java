package assignments;

import java.util.HashMap;
import java.util.Map;

// Employee class (user-defined object)
class Employee1 {
    private int id;
    private String name;
    private String city;

    // Constructor
    public Employee1(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    // Getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

public class HashMapOp {
    public static void main(String[] args) {
        // Create HashMap with Employee ID as key and Employee object as value
        Map<Integer, Employee1> employeesMap = new HashMap<>();

        // Add 5 employees
        employeesMap.put(101, new Employee1(101, "Raj", "Delhi"));
        employeesMap.put(102, new Employee1(102, "Anita", "Mumbai"));
        employeesMap.put(103, new Employee1(103, "Karan", "Bangalore"));
        employeesMap.put(104, new Employee1(104, "Meera", "Chennai"));
        employeesMap.put(105, new Employee1(105, "Vikram", "Pune"));

        // Display all employees
        System.out.println("All Employees in HashMap:");
        for (Map.Entry<Integer, Employee1> entry : employeesMap.entrySet()) {
            System.out.println("Key (Employee Id): " + entry.getKey() +
                               " -> Value: " + entry.getValue());
        }

        // Display Employee details based on Employee Id
        int searchId = 103; // Example: search employee with ID = 103
        System.out.println("\nSearching for Employee with ID " + searchId + ":");
        Employee1 emp = employeesMap.get(searchId);
        if (emp != null) {
            System.out.println("Employee found: " + emp);
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }
    }
}
