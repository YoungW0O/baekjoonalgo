package Lv_D;

import java.util.Scanner;

public class D_7_5597 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int [] array = new int[30];
        int min = 30;
        int max = 0;

        for (int i = 0; i<30;i++){
            array[i] = i+1;
        }

        for (int i = 0; i<28;i++){
            int x = sc.nextInt();
            for (int j = 0; j<30;j++){
                if (x == array[j]) array[j]=0;
            }
        }
        for (int i = 0; i<30;i++){
            if (array[i] != 0){
                if (min > array[i]) {
                    min = array[i];
                }
                if (max < array[i]){
                    max = array[i];
                }
            }
        }

        System.out.println(min);
        System.out.println(max);

    }
}
