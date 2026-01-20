package Lv_M;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class M_3_25305 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();
        Integer [] array = new Integer[N];

        for (int i = 0; i<N; i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array,Collections.reverseOrder());

        System.out.println(array[k-1]);
    }
}
