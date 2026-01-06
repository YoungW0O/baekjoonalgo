package Lv_B;

import java.util.Scanner;

public class B_5_2884 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();//time
        int B = sc.nextInt();//min
        int alram = B-45;

        if(alram<0){
            A -= 1;
            B = 60+alram;
        }

        if (A<0){
            A = 24-1;
        }
        if (alram>=0) {B=alram;}

        System.out.println(A+" "+B);

    }
}
