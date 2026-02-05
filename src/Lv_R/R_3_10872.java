package Lv_R;

import java.util.Scanner;

public class R_3_10872 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = 1;

        if (N==0) System.out.println(1);
        else {
            for (int i = N; i>0; i--){
                result *= i;
            }
            System.out.println(result);
        }
    }
}
