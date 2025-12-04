// Constructor for Student class
// Attributes: name, age
// Methods: getDetails(), showDetails()
// Create an object of Student class and display the details.

package Simply;

public class Student_Constructor {
    String name;
    int age;

    // Constructor to initialize Student object
    public Student_Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to get student details
    public String getDetails() {
        return "Name: " + name + ", Age: " + age;
    }

    // Method to show student details
    public void showDetails() {
        System.out.println(getDetails());
    }

    public static void main(String[] args) {
        // Creating an object of Student_Constructor class
        Student_Constructor student = new Student_Constructor("Alice", 20);
        
        // Displaying student details
        student.showDetails();
    }
}
