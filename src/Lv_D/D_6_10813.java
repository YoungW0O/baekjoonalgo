package Lv_D;

import java.util.Scanner;

public class D_6_10813 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] array = new int[N];
        int dum = 0;

        for (int i = 0; i<N;i++){
            array[i] = i+1;
        }
        for (int i = 0; i<M; i++){
            int I = sc.nextInt()-1;
            int J = sc.nextInt()-1;

            dum = array[I];
            array[I] = array[J];
            array[J] = dum;
        }

        for (int i = 0; i<N;i++){
            System.out.print(array[i]+" ");
        }

    }
}
