package Lv_D;

import java.util.Scanner;

public class D_4_2562 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int [] array = new int[9];
        int max = 0;
        int cnt = 0;

        for (int i = 0; i<9; i++){
            array[i] = sc.nextInt();
            if (max <array[i]){
                max = array[i];
                cnt = i+1;
            }
        }
        System.out.println(max);
        System.out.println(cnt);
    }
}
