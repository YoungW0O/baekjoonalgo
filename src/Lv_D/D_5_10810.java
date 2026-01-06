package Lv_D;

import java.util.Arrays;
import java.util.Scanner;

public class D_5_10810 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] array = new int[N];

        for (int i = 0; i<M; i++){
            int l = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for(int a = l-1; a<j; a++){
                array[a] =k;
            }
        }
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }

    }
}
