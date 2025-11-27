// Implement the concept of package and interface. 

package Program5;

public class pkg_interface {
    public static void main(String[] args) {
        System.out.println("Demonstrating Package and Interface");
        System.out.println("Current Package: Program5");
        
        Car myCar = new Car();
        myCar.start();
        myCar.stop();
    }
}

// Interface declaration
interface Vehicle {
    void start();
    void stop();
}

// Class implementing the interface
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }
}
