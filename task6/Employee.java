package task6;

public class Employee {

    private int id;
    private String name;

    // Constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Display Method
    public void display() {
        System.out.println("ID: " + id + " | Name: " + name);
    }
}