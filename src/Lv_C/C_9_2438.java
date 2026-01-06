package Lv_C;

import java.util.Scanner;

public class C_9_2438 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        for(int i = 0; i<A; i++){
            for(int j=A-1-i; j<A; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
