// Create a class Car with a no-argument constructor that prints any message.
// Create two objects to ensure that the constructor is called for each object creation.

package Simply;

public class Car {
    // No-argument constructor
    public Car() {
        System.out.println("Car object created!");
    }

    public static void main(String[] args) {
        // Creating first object of Car class
        Car car1 = new Car();

        // Creating second object of Car class
        Car car2 = new Car();
    }
}
