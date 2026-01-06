package Lv_C;

import java.util.Scanner;

public class C_4_25304 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = 0;

        for (int i=0; i<B; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            sum += a*b;
        }
        if (sum == A) {
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
