// Implement String and StringBuffer classes.

package Program3;

public class Buffer {
    public static void main(String[] args) {
        // Demonstrate 10 String methods
        String s = "  Hello World  ";
        System.out.println("Original String: '" + s + "'");

        // 1. trim()
        String trimmed = s.trim();
        System.out.println("trim(): '" + trimmed + "'");

        // 2. length()
        System.out.println("length(): " + trimmed.length());

        // 3. charAt()
        System.out.println("charAt(1): " + trimmed.charAt(1));

        // 4. substring(start,end)
        System.out.println("substring(0,5): " + trimmed.substring(0, 5));

        // 5. contains()
        System.out.println("contains('lo Wo'): " + trimmed.contains("lo Wo"));

        // 6. equals()
        System.out.println("equals('Hello World'): " + trimmed.equals("Hello World"));

        // 7. equalsIgnoreCase()
        System.out.println("equalsIgnoreCase('hello world'): " + trimmed.equalsIgnoreCase("hello world"));

        // 8. indexOf()
        System.out.println("indexOf('o'): " + trimmed.indexOf('o'));

        // 9. lastIndexOf()
        System.out.println("lastIndexOf('o'): " + trimmed.lastIndexOf('o'));

        // 10. replace()
        String replaced = trimmed.replace("World", "Java");
        System.out.println("replace('World','Java'): " + replaced);

        System.out.println("\n--- StringBuffer demonstrations ---");

        // Demonstrate 10 StringBuffer methods
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Original StringBuffer: " + sb);

        // 1. append()
        sb.append(" World");
        System.out.println("append(' World'): " + sb);

        // 2. insert()
        sb.insert(5, ',');
        System.out.println("insert(5, ','): " + sb);

        // 3. replace(start,end,str)
        sb.replace(6, 11, "Java");
        System.out.println("replace(6,11,'Java'): " + sb);

        // 4. delete(start,end)
        StringBuffer sb2 = new StringBuffer("ABCDEFG");
        System.out.println("sb2 before delete: " + sb2);
        sb2.delete(2, 5);
        System.out.println("sb2 after delete(2,5): " + sb2);

        // 5. deleteCharAt(index)
        sb2.deleteCharAt(0);
        System.out.println("sb2 after deleteCharAt(0): " + sb2);

        // 6. reverse()
        StringBuffer rev = new StringBuffer("stressed");
        rev.reverse();
        System.out.println("reverse('stressed'): " + rev);

        // 7. capacity()
        System.out.println("sb capacity(): " + sb.capacity());

        // 8. ensureCapacity()
        sb.ensureCapacity(100);
        System.out.println("ensureCapacity(100) -> capacity(): " + sb.capacity());

        // 9. setLength()
        sb.setLength(5);
        System.out.println("setLength(5): " + sb);

        // 10. charAt()
        System.out.println("charAt(1) of sb: " + sb.charAt(1));
    }
}
