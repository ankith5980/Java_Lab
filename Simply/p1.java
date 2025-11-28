package Simply;

import java.util.*;

public class p1 {
    public static void main(String[] args) {
        System.out.println("Please enter a number :: ");
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println("Number is :: " + num);

        sc.close();
    }
}
