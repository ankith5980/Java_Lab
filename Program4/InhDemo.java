// Implement the concept of inheritance, super keyword, abstract class and final keyword.

package Program4;

public class InhDemo {
    public static void main(String[] args) {
        System.out.println("Inheritance & super keyword demo");
        Dog d = new Dog("Buddy", 5);
        d.speak();
        d.showInfo();

        System.out.println();
        System.out.println("Abstract class demo");
        Shape c = new Circle(3.0);
        c.draw();
        System.out.println("Area: " + c.area());

        System.out.println();
        System.out.println("final keyword demo");
        FinalClass fc = new FinalClass();
        fc.showFinal();
        System.out.println("(Trying to extend a final class or override a final method will cause a compile-time error.)");
    }
}

// Simple parent class to demonstrate inheritance and super
class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal constructor called");
    }

    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}

// Subclass demonstrating use of super to call parent constructor and methods
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age); // call parent constructor
        System.out.println("Dog constructor called");
    }

    @Override
    public void speak() {
        super.speak(); // call parent method
        System.out.println(name + " barks.");
    }

    public void showInfo() {
        System.out.println("Dog name: " + name + ", age: " + age);
    }
}

// Abstract class 
abstract class Shape {
    public abstract void draw();
    public abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double r) { this.radius = r; }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Final class and final method
final class FinalClass {
    public final void showFinal() { System.out.println("Final method in final class."); }
}

// The following would be a compile-time error because FinalExample is final:
// class FinalChild extends FinalExample { }

