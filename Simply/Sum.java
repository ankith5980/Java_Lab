// This program is used to calculate the sum of two numbers using class and object

package Simply;

import java.util.Scanner;

public class Sum {

    public int calculateSum(int a, int b) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = scanner.nextInt();
        System.out.print("Enter second number: ");
        b = scanner.nextInt();
        scanner.close();
        return a + b;
    }
    public static void main(String[] args) {
        // Creating an object of the Sum class
        Sum sumObject = new Sum();
        
        // Calling the method to calculate sum
        int result = sumObject.calculateSum(0, 0);
        
        // Printing the result
        System.out.println("The sum of the two numbers is: " + result);
    }
}
