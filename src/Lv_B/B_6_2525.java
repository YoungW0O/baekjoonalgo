package Lv_B;

import java.util.Scanner;

public class B_6_2525 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int time;

        B = B+C;

        if (B>=60){
            time = B / 60;
            B = B % 60;
            A += time;
            if (A>=24) A -= 24;
        }

        System.out.println(A+" "+B);
    }
}
