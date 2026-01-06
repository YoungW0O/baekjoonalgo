package Lv_E;

import java.util.Scanner;

public class E_7_2675 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i<T; i++){
            int A = sc.nextInt();
            String B = sc.next();
            for (int j= 0; j<B.length(); j++){
                for (int k = 0 ;k<A; k++){
                    System.out.print(B.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
