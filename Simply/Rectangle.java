// Create a Rectangle class with attributes length and width.
// Use a parameterized constructor to set values for length and width.
// Write a method to calculate and return the area of the rectangle and implement it in the main method.

package Simply;

public class Rectangle {
    int length;
    int width;

    // Parameterized constructor to initialize length and width
    public Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    // Method to calculate area
    public int calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        // Creating an object of Rectangle class with length and width
        Rectangle rect = new Rectangle(10, 5);

        // Calculating area
        int area = rect.calculateArea();

        // Printing the area
        System.out.println("The area of the rectangle is: " + area);
    }
}
