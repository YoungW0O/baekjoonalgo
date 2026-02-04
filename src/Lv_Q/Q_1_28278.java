package Lv_Q;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q_1_28278 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i<N ; i++){
            st = new StringTokenizer(br.readLine());

            int input = Integer.parseInt(st.nextToken());

            switch (input){
                case 1 :
                    int num = Integer.parseInt(st.nextToken());
                    stack.push(num);
                    break;
                case 2 :
                    if(!stack.isEmpty()){
                        sb.append(stack.peek()).append("\n");
                        stack.pop();
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case 3 :
                    sb.append(stack.size()).append("\n");
                    break;
                case 4 :
                    if(stack.empty()){
                        sb.append(1).append("\n");
                    }else {
                        sb.append(0).append("\n");
                    }
                    break;
                case 5 :
                    if (!stack.isEmpty()){
                        sb.append(stack.peek()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
            }
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
