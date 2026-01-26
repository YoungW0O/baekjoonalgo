package Lv_P;

import java.util.Arrays;
import java.util.Scanner;

public class P_4_2485 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] tree = new int[N];

        for (int i = 0; i<N;i++){
            tree[i] = sc.nextInt();
        }
        Arrays.sort(tree);

        int gcd = 0;

        for (int i = 0; i<N-1;i++){
            int distance = tree[i+1] -tree[i];
            gcd = findgcd(distance,gcd);
        }
        int result = (tree[N-1]-tree[0])/gcd+1- (tree.length);
        System.out.println(result);

    }

    private static int findgcd(int a, int b){

        while (b !=0){
            int r = a%b;

            a = b;
            b = r;
        }
        return a;
    }
}
