package Lv_Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q_11_24511 {
    public static void main (String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [] listQueueStack  = new int[N];
        int [] currentList = new int[N];

        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i<N; i++){
            listQueueStack[i] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i<N; i++){
            currentList[i] = Integer.parseInt(st1.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int [] insertlist = new int[M];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i =0;i<M;i++){
            insertlist[i] = Integer.parseInt(st2.nextToken());
        }

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i<N; i++){
            if(listQueueStack[i] ==0){
                deque.addFirst(currentList[i]);
            }
        }
        for(int i = 0; i<M; i++){
            deque.add(insertlist[i]);
            sb.append(deque.pollFirst()).append(" ");
        }
        System.out.println(sb);
    }
}
