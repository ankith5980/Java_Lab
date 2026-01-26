// Implement the concept of inheritance, super keyword, abstract class and final keyword.
// Create an abstract class vehicle with an attribute brand, a constructor to set the attribute,
// an abstract method to start and a concrete method fuelType. [final method]
// Create a subclass car with attribute speed that extends vehicle, Uses the super keyword
// to access the parent constructor and overrides the strat method.
// Use the final keyword to prevent method overriding in the final type method.

package Program4;

// 1. Abstract Class: Cannot be instantiated directly
abstract class Vehicle {
    String brand;

    // Constructor to set the attribute
    Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract Method: No body, must be implemented by subclass
    abstract void start();

    // 2. Final Method: Cannot be overridden by subclasses
    final void fuelType() {
        System.out.println("Standard Fuel Type: Petrol/Diesel/Electric");
    }
}

// 3. Inheritance: Car inherits from Vehicle
class Car extends Vehicle {
    int speed;

    Car(String brand, int speed) {
        // 4. Super Keyword: Calls the constructor of the parent class
        super(brand); 
        this.speed = speed;
    }

    // Overriding the abstract method from parent
    @Override
    void start() {
        System.out.println("The " + brand + " is starting and can reach speeds of " + speed + " km/h.");
    }
    
    // Note: Trying to override fuelType() here would cause a compilation error
    // because it is marked as 'final' in the parent class.
}

// Main class to test the implementation
public class InhDemo {
    public static void main(String[] args) {
        // Creating an object of the subclass
        Car myCar = new Car("Toyota", 180);

        // Calling methods
        myCar.start();      // Calls the overridden method in Car
        myCar.fuelType();   // Calls the final concrete method in Vehicle
    }
}
