/* Task 6 – Mini CRUD Console App

Create a simple Employee Management System:
Menu:

1. Add Employee
2. View Employees
3. Delete Employee
4. Exit

Employee fields:

● id
● name

Skills Checked

● OOP
● ArrayList
● Logic
● Real project thinking */

package task6;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {

    static ArrayList<Employee> employees = new ArrayList<>();

    // Add Employee
    static void addEmployee(Scanner sc) {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        employees.add(new Employee(id, name));
        System.out.println("Employee Added Successfully ");
    }

    // View Employees
    static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No Employees Found ");
            return;
        }

        System.out.println("\nEmployee List:");
        for (Employee e : employees) {
            e.display();
        }
    }

    // Delete Employee
    static void deleteEmployee(Scanner sc) {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        boolean removed = false;

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.remove(i);
                removed = true;
                break;
            }
        }

        if (removed) {
            System.out.println("Employee Deleted ");
        } else {
            System.out.println("Employee Not Found ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Employee Management ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Delete Employee");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmployee(sc);
                    break;

                case 2:
                    viewEmployees();
                    break;

                case 3:
                    deleteEmployee(sc);
                    break;

                case 4:
                    System.out.println("Exiting... ");
                    break;

                default:
                    System.out.println("Invalid Choice ");
            }

        } while (choice != 4);

        sc.close();
    }
}