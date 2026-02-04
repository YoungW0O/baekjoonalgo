package Lv_Q;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q_10_2346 {

    public static void main (String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Balloon> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] ballonLocation = new int[N];

        for (int i = 0; i<N; i++){
            ballonLocation[i] = Integer.parseInt(st.nextToken());
        }

        sb.append("1 ");

        int MoveValue  = ballonLocation[0];

        for (int i = 1; i<N ; i++){
            deque.add(new Balloon(i+1,ballonLocation[i]));
        }

        while (!deque.isEmpty()){

            if (MoveValue>0){
                for(int i =1;i<MoveValue; i++){
                    deque.add(deque.poll());
                }
                Balloon next = deque.poll();
                MoveValue = next.numValue;
                sb.append(next.index+" ");
            }
            else {
                for(int i =1; i<-MoveValue; i++){
                    deque.addFirst(deque.pollLast());
                }
                Balloon next = deque.pollLast();
                MoveValue = next.numValue;
                sb.append(next.index+" ");
            }
        }

        System.out.println(sb);

    }

}
class Balloon{
    int index;
    int numValue;

    public Balloon(int index, int numValue) {
        this.index = index;
        this.numValue = numValue;
    }
}