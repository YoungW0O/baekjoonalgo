package Lv_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q_6_18258 {
    public static void main (String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> q = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer command;

        while (N --> 0){
            command = new StringTokenizer(br.readLine()," ");

            switch (command.nextToken()){

                case "push" :
                    q.offer(Integer.parseInt(command.nextToken()));
                    break;

                case "pop" :
                    Integer item = q.poll();
                    if (item == null){
                        sb.append(-1).append('\n');
                    }
                    else sb.append(item).append('\n');
                    break;

                case "size" :
                    sb.append(q.size()).append('\n');
                    break;

                case "empty" :
                    if(q.isEmpty()){
                        sb.append(1).append('\n');
                    }
                    else sb.append(0).append('\n');

                    break;

                case "front" :
                    Integer item1 = q.peek();
                    if(item1 == null){
                        sb.append(-1).append('\n');
                    }
                    else sb.append(item1).append('\n');
                    break;

                case "back" :
                    Integer item2 = q.peekLast();
                    if(item2 == null) {
                        sb.append(-1).append('\n');
                    }
                    else sb.append(item2).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}
