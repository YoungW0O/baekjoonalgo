package Lv_M;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class M_10_10814 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String [][] array = new String[N][2];

        for(int i=0; i<N;i++){
            array[i][0] = sc.next();
            array[i][1] = sc.next();
        }

        Arrays.sort(array, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
            }
        });

        for (int i =0;i<N;i++){
            System.out.println(array[i][0]+ " "+ array[i][1]);
        }
    }
}
