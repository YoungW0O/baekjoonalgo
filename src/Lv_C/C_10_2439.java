package Lv_C;

import java.util.Scanner;

public class C_10_2439 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        sc.close();

        for (int i = 1; i <= A; i++) {
            for (int j = 1; j <= A - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
