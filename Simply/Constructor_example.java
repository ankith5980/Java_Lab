// Program to demonstrate the use of constructors to initialize object properties and perform a calculation.

package Simply;

public class Constructor_example {
    int num1;
    int num2;
    
    // Constructor to initialize the numbers
    public Constructor_example(int a, int b) {
        num1 = a;
        num2 = b;
    }
    
    // Method to calculate sum
    public int calculateSum() {
        return num1 + num2;
    }
    
    public static void main(String[] args) {
        // Creating an object of the Constructor_example class with initial values
        Constructor_example obj = new Constructor_example(10, 20);
        
        // Calling the method to calculate sum
        int result = obj.calculateSum();
        
        // Printing the result
        System.out.println("The sum of the two numbers is: " + result);
    }
}
