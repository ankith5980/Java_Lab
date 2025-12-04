// Program to enter elements into an array using for loop and the printing the elements sequentially

package Simply;

public class p5 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        
        // Entering elements into the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) * 10; // Assigning values 10, 20, 30, 40, 50
        }
        
        // Printing the elements sequentially
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
