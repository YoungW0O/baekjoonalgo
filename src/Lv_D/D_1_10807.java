package Lv_D;

import java.util.Scanner;

public class D_1_10807 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int [] array = new int[N];
        int cnt = 0;

        for (int i=0; i<N; i++){
            array[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        for (int i = 0; i<N;i++){
            if (array[i]==v) cnt++;
        }
        System.out.println(cnt);


    }
}
