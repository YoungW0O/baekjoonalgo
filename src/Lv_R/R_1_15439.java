package Lv_R;

import java.util.Scanner;

public class R_1_15439 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int [] top = new int[N];
        int [] Bottom = new int[N];

        for (int i = 0; i<N; i++){
            top[i] = i;
            Bottom[i] = i;
        }

        int Result = N*N;

        for (int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                if (top[i]==Bottom[j]) Result--;
            }
        }

        System.out.println(Result);
    }
}
