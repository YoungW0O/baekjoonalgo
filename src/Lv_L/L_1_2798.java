package Lv_L;

import java.util.Scanner;

public class L_1_2798 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int black = 0;
        int [] arr = new int[A];

        for (int i = 0; i<A; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i<A-2; i++){
            for(int j =i+1; j<A-1; j++){
                for(int k= j+1; k<A;k++){
                    int temp = arr[i]+arr[j]+arr[k];

                    if (black <=temp){
                        if(B>=temp){
                            black = temp;
                        }
                    }
                }
            }
        }

        System.out.println(black);

    }
}
