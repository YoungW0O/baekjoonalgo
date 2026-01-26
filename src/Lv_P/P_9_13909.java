package Lv_P;

import java.util.Scanner;

public class P_9_13909 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;

        for (int i=1 ; i*i<= N;i++){
            cnt++;
        }
        System.out.println(cnt);
    }
}
