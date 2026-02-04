package Lv_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q_5_12789 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [] students = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i<N; i++){
            students[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();

        int index = 0;
        int num = 1;
        while (index <N){
            if (students[index]==num){
                num++;
                index++;
            } else if (!stack.isEmpty() && stack.peek() ==num) {
                stack.pop();
                num++;
            } else {
                stack.push(students[index]);
                index++;
            }
        }

        while (!stack.isEmpty() &&stack.peek() == num){
            stack.pop();
            num++;
        }
        if(num == N+1){
            System.out.println("Nice");
        }
        else System.out.println("Sad");

    }
}
