package Lv_P;

import java.util.Scanner;

public class P_1_1943 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i<T;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = gcd(a,b);

            System.out.println(a*b/c);
        }


    }

    private static int gcd (int a, int b){
        while (b !=0){

            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}
