// Create a Java class Employee with private variables name, id, and department. 
// Use constructor overloading to initialize employee details in three ways: 
// only name, name and id, and name, id, and department. Display the details of each employee.
package Day_6.Practice_Question;

public class Employee {
    private String name;
    private int id;
    private String department;

    // Constructor with name
    public Employee(String name) {
        this.name = name;
    }

    // Constructor with name and id
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Constructor with name, id, and department
    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Ankit");
        Employee e2 = new Employee("Rahul", 101);
        Employee e3 = new Employee("Aman", 102, "IT");

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
