package Lv_D;

import java.util.Arrays;
import java.util.Scanner;

public class D_2_10871 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        int [] array = new int[N];
        int cnt = 0;

        for (int i=0; i<N; i++){
            array[i] = sc.nextInt();
        }

        for (int i = 0; i<N;i++){
            if (array[i]<X) {
                System.out.print(array[i]+" ");
            }
        }




    }
}