package Lv_Q;

import java.util.Scanner;
import java.util.Stack;

public class Q_2_10773 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i<K;i++){
            int N = sc.nextInt();
            if (N==0){
                stack.pop();
            }
            else {
                stack.push(N);
            }
        }
        for (int o : stack){
            sum += o;
        }
        System.out.println(sum);
    }
}
