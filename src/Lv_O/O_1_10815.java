package Lv_O;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class O_1_10815 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr_N = new int[N];
        HashSet<Integer> set_N = new HashSet<>();

        for(int i =0; i<N;i++){
            arr_N[i] =sc.nextInt();
            set_N.add(arr_N[i]);
        }
        int M = sc.nextInt();
        int [] arr_M = new int[M];

        for (int i =0; i<M; i++){
            arr_M[i] = sc.nextInt();
        }

        for (int i =0;i<arr_M.length;i++){
            if(set_N.contains(arr_M[i])){
                System.out.print("1 ");
            }
            else System.out.print("0 ");
        }
    }
}
