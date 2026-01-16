package Lv_I;

import java.util.Scanner;

public class I_3_1978 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i<N; i++){
            int A = sc.nextInt();
            int cnt = 0;
            for (int j=1; j<=A; j++){
                if(A%j==0){
                    cnt++;
                }
            }
            if(cnt==2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
