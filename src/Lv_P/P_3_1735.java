package Lv_P;

import java.util.Scanner;

public class P_3_1735 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int numerator = A*D + B*C;
        int denominator = B*D;

        int temp = gcd(numerator,denominator);

        System.out.println(numerator/temp);
        System.out.println(denominator/temp);

    }

    private static int gcd(int a, int b){

        while (b !=0){
            int r = a%b;

            a = b;
            b = r;
        }
        return a;
    }
}
