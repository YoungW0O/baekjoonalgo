package Lv_M;

import java.util.Arrays;
import java.util.Scanner;

public class M_8_11651 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [][] array = new int[N][2];

        for(int i = 0; i<N; i++){
            array[i][1] = sc.nextInt();
            array[i][0] = sc.nextInt();
        }

        Arrays.sort(array, (e1,e2)->{
            if (e1[0]==e2[0]){
                return e1[1] -e2[1];
            }
            else {
                return e1[0] -e2[0];
            }
        });

        for (int i = 0; i<N; i++){
            System.out.println(array[i][1]+" "+array[i][0]);
        }
    }

}
