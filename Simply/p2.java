package Simply;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        System.out.println("Please enter the number of units :: ");

        Scanner sc = new Scanner(System.in);

        int units = sc.nextInt();

        System.out.println("The numbers are :: ");

        for(int i=0; i<units; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
