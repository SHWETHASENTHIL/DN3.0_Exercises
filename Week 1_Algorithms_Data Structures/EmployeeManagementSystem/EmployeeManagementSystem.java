package EmployeeManagementSystem;
import java.util.Arrays;

public class EmployeeManagementSystem {
    private Employee[] employees;
    private int count;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    // Method to add an employee
    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
        } else {
            System.out.println("Array is full. Cannot add more employees.");
        }
    }

    // Method to search for an employee by employeeId
    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }

    // Method to traverse and print all employees
    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    // Method to delete an employee by employeeId
    public void deleteEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                employees[i] = employees[count - 1]; // Replace with last element
                employees[count - 1] = null; // Nullify last element
                count--;
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem(5);

        Employee e1 = new Employee("E001", "Sara", "Manager", 70000);
        Employee e2 = new Employee("E002", "Gwen", "Developer", 60000);
        Employee e3 = new Employee("E003", "Olivia", "Analyst", 50000);

        system.addEmployee(e1);
        system.addEmployee(e2);
        system.addEmployee(e3);

        System.out.println("All employees:");
        system.traverseEmployees();

        System.out.println("\nSearching for employee E002:");
        Employee foundEmployee = system.searchEmployee("E002");
        if (foundEmployee != null) {
            System.out.println("Employee found: " + foundEmployee);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting employee E002:");
        system.deleteEmployee("E002");

        System.out.println("All employees after deletion:");
        system.traverseEmployees();
    }
}

