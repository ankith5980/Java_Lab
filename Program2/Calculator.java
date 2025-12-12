// Implement the concept of function overloading & Constructor overloading.
// Create a class Calculator with attributes a and b.
// Write two constructors of it, a default and parameterized(int, int).
// Write two functions add(int, int) and add(int, int, int).
// Create objects for both the constructors and use the Overloaded methods.

package Program2;
public class Calculator {
    public int a;
    public int b;

    // Default constructor
    public Calculator() {
        this.a = 0;
        this.b = 0;
    }

    // Parameterized constructor
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method to add two integers
    public int add(int x, int y) {
        return x + y;
    }

    // Method to add three integers
    public int add(int x, int y, int z) {
        return x + y + z;
    }
    public static void main(String[] args) {
        // Creating object using default constructor
        Calculator calc1 = new Calculator();
        System.out.println("Default Constructor:");
        System.out.println("Addition of 5 and 10: " + calc1.add(5, 10));

        System.out.println("\n");
        
        // Creating object using parameterized constructor
        Calculator calc2 = new Calculator(3, 7);
        System.out.println("Parameterized Constructor:");
        System.out.println("Addition of 5, 10 and 15: " + calc2.add(5, 10, 15));
    }
}
