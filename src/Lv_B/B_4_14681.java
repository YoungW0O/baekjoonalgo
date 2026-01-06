package Lv_B;

import java.util.Scanner;

public class B_4_14681 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A>0){
            if(B>0) System.out.println("1");
            else System.out.println("4");
        } else {
            if(B<0) System.out.println("3");
            else System.out.println("2");
        }

    }
}
