package Simply;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        System.out.println("Enter a number to check :: ");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println("Result");

        if (num > 0) {
            System.out.println("The number " + num + " is positive!");
        } else if (num < 0) {
            System.out.println("The number " + num + " is negative!");
        } else if (num == 0) {
            System.out.println("The number " + num + " is neither positive nor negative");
        }
        sc.close();
    }
}
