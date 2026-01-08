// Create a class Circle with a static method calculateArea() that calculates the area of a circle.
// Call this method from the main method.

package Simply;

public class Circle {
    // Static method to calculate area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double radius = 5.0;
        double area = Circle.calculateArea(radius);
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
    }
}
