package Lv_P;

import java.util.Scanner;

public class P_2_13241 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        Long A = sc.nextLong();
        Long B = sc.nextLong();

        Long C = gcd(A,B);

        System.out.println(A*B/C);


    }

    private static Long gcd(Long a, Long b){
        while (b!=0){
            Long r = a%b;

            a = b;
            b = r;
        }
        return a;
    }
}
