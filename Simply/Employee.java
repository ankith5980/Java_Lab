// Create a class Employee with data members name, age, and salary.
// Implement constructors with 1, 2 and 3 parameters to initialize these data members.
// Implement a method display() to print the employee details.
// Create objects of the Employee class using different constructors and call the display() method.

package Simply;

public class Employee {
    String name;
    int age;
    double salary;

    // Constructor with 1 parameter
    public Employee(String name) {
        this.name = name;
        this.age = 0;
        this.salary = 0.0;
    }

    // Constructor with 2 parameters
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.salary = 0.0;
    }

    // Constructor with 3 parameters
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Employee emp1 = new Employee("Alice");
        Employee emp2 = new Employee("Bob", 30);
        Employee emp3 = new Employee("Charlie", 25, 50000);

        // Calling display() method for each object
        emp1.display();
        emp2.display();
        emp3.display();
    }
}
