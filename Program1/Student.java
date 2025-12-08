// Implement the concept of class, data members, member functions and access specifiers.
// Create a class Student with the data members name and age.
// Member functions setData() and display()
// Access specifiers: private for name and age, public for member functions.
// Create an object of the class and call the methods
// Use two seperate classes in the same file and call the object of one class in the main method of another class.


class Student2 {
    private String name;
    private int age;

    // Method to set data
    public void setData(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display data
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Student {
    public static void main(String[] args) {
        // Creating an object of Student class from another class
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        
        // Setting data
        s1.setData("Alice", 21);
        s2.setData("Bob", 22);

        // Displaying data
        System.out.println("Student Details from a separate class:");
        s1.display();
        s2.display();
    }
}