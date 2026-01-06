package Lv_D;

import java.util.Scanner;

public class D_3_10818 {

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            int [] array = new int[N];
            int min = 1000000;
            int max = -1000000;

            for (int i = 0; i<N; i++){
                array[i] = sc.nextInt();

                if (min >array[i]){
                    min = array[i];
                }
                if (max < array[i]){
                    max = array[i];
                }
            }
            System.out.println(min + " "+ max);
        }
    }
