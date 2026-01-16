package Lv_J;

import java.util.Arrays;
import java.util.Scanner;

public class J_5_9063 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int []A =new int[N];
        int []B = new int[N];
        for (int i = 0; i<N; i++){

            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);

        System.out.println( (A[N-1]-A[0]) * (B[N-1]-B[0]) );
    }
}
