package Lv_C;

import java.util.Scanner;

public class C_5_25314 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        String str = "";

        for (int i = 0; i<A/4; i++){
            str += "long ";
        }

        System.out.println(str+"int");

    }
}
