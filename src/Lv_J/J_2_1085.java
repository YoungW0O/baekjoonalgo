package Lv_J;

import java.util.Scanner;

public class J_2_1085 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int A = Math.min(x, w-x);
        int B = Math.min(y, h-y);

        System.out.println(Math.min(A,B));
    }
}
