// Implement the concept of class, data members, member functions and access specifiers.

public class Basic {
    private int id;           // private data member
    public String name;       // public data member

    // Constructor
    public Basic(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Public member function (method)
    public void display() {
        System.out.println("id = " + id + ", name = " + name);
    }

    // Getter for private field
    public int getId() {
        return id;
    }

    // Setter for private field
    public void setId(int id) {
        this.id = id;
    }

    // Main to demonstrate usage
    public static void main(String[] args) {
        Basic b = new Basic(1, "Alice");
        b.display();                   // prints fields
        b.setId(2);
        System.out.println("id via getter: " + b.getId());
    }
}
