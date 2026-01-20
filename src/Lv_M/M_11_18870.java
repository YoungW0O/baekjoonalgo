package Lv_M;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class M_11_18870 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int [] orgin = new int[N];
        int [] sorted = new int[N];
        HashMap<Integer,Integer> rankingmap = new HashMap<Integer,Integer>();

        for (int i = 0; i<N; i++){
            orgin[i] = sorted[i] = sc.nextInt();
        }

        Arrays.sort(sorted);

        int rank = 0;
        for (int v : sorted){
            if(!rankingmap.containsKey(v)){
                rankingmap.put(v,rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int key : orgin){
            int ranking = rankingmap.get(key);
            sb.append(ranking).append(' ');
        }

        System.out.println(sb);

    }
}
