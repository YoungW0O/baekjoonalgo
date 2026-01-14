package Lv_H;

import java.util.Scanner;

public class H_4_2903 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt;
        int cnt1=2;
        int sum;

        for (int i = 1; i<N;i++){
            cnt1 *= 2;
        }
        cnt =(cnt1+1);
        sum = cnt*cnt;
        System.out.println(sum);
    }
}
