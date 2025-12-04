// Create a Book class with attributes title and price.
// Create a default constructor to initialize these attributes.
// Create a parameterized constructor and set title and price through it.
// Create a method show to display the book details.

package Simply;

public class Book {
    String title;
    double price;

    // Default constructor
    public Book() {
        title = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    public Book(String t, double p) {
        title = t;
        price = p;
    }

    // Method to display book details
    public void show() {
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        // Creating an object using default constructor
        Book book1 = new Book();
        System.out.println("Book 1 Details:");
        book1.show();

        // Creating an object using parameterized constructor
        Book book2 = new Book("Java Programming", 29.99);
        System.out.println("\nBook 2 Details:");
        book2.show();
    }
}
