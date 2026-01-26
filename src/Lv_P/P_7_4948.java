package Lv_P;

import java.util.Scanner;

public class P_7_4948 {

    public static boolean [] prime;

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        while (true){
            int cnt = 0;
            int N = sc.nextInt();
            if (N == 0) break;
            prime = new boolean[2*N+1];
            get_prime();
            for (int i =N+1; i<2*N+1;i++){
                if(!prime[i]) cnt++;
            }
            System.out.println(cnt);

        }
    }

    public static void get_prime(){
        prime[0] = prime[1] =true;

        for(int i =2; i<Math.sqrt(prime.length); i++){
            if(prime[i]) continue;
            for(int j = i*i; j< prime.length; j+=i){
                prime[j] = true;
            }
        }
    }
}
