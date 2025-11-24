// Implement the concept of function overloading & Constructor overloading.

package Program2;

public class Overloading {
    // Fields
    private int x;
    private int y;

    // Constructor overloading
    public Overloading() {
        this.x = 0;
        this.y = 0;
        System.out.println("No-arg constructor");
    }

    public Overloading(int x) {
        this.x = x;
        this.y = 0;
        System.out.println("One-arg constructor: x=" + x);
    }

    public Overloading(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Two-arg constructor: x=" + x + ", y=" + y);
    }

    // Method (function) overloading: add
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded display methods
    public void display() {
        System.out.println("x=" + x + ", y=" + y);
    }

    public void display(String prefix) {
        System.out.println(prefix + " x=" + x + ", y=" + y);
    }

    // Main to demonstrate constructor and method overloading
    public static void main(String[] args) {
        Overloading o1 = new Overloading();
        Overloading o2 = new Overloading(5);
        Overloading o3 = new Overloading(2, 3);

        System.out.println("add(int,int) = " + o1.add(2, 3));
        System.out.println("add(int,int,int) = " + o1.add(1, 2, 3));
        System.out.println("add(double,double) = " + o1.add(1.5, 2.5));

        o2.display();
        o3.display();
        o3.display("Info:");
    }
}
