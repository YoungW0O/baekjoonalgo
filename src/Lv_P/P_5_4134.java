package Lv_P;

import java.util.Scanner;

public class P_5_4134 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int i =0; i< T; i++){
            long N = sc.nextLong();
            if (N <= 1) N = 2;
            while(true){
                int count = 0;
                for(int j = 2; j<=Math.sqrt(N); j++){
                    if(N%j==0){
                        count++;
                        break;
                    }
                }

                if(count == 0){
                    System.out.println(N);
                    break;
                }
                N++;
            }
        }
    }
}
