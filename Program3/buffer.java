// Implement String and StringBuffer classes.

package Program3;

public class Buffer {
    public static void main(String[] args) {
        // String (immutable)
        String s = "Hello";
        System.out.println("Original String: " + s);
        String s2 = s.concat(" World"); // returns a new String
        System.out.println("After concat -> original: " + s);
        System.out.println("After concat -> new: " + s2);

        // StringBuffer (mutable)
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Original StringBuffer: " + sb);
        sb.append(" World"); // mutates same object
        System.out.println("After append -> same object: " + sb);
    }
}
