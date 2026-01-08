// Create a class named Static_Book with static block that initializes static variable message.
// Print the message in the main method.

package Simply;

public class Static_Book {
    static String message;

    // Static block to initialize static variable
    static {
        message = "Welcome to the Static Book Class!";
    }

    public static void main(String[] args) {
        // Print the message
        System.out.println(message);
    }   
}
