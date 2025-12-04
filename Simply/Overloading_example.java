// Program to demonstrate method overloading through (1) changing the number of parameters and (2) changing the data types of parameters.

package Simply;

public class Overloading_example {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overloading_example obj = new Overloading_example();

        // Calling method with two integer parameters
        System.out.println("Sum of 10 and 20: " + obj.add(10, 20));

        // Calling overloaded method with three integer parameters
        System.out.println("Sum of 10, 20 and 30: " + obj.add(10, 20, 30));

        // Calling overloaded method with two double parameters
        System.out.println("Sum of 10.5 and 20.5: " + obj.add(10.5, 20.5));
    }
}
