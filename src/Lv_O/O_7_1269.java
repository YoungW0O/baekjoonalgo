package Lv_O;

import java.util.HashSet;
import java.util.Scanner;

public class O_7_1269 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        HashSet<Integer> Set1 = new HashSet<>();
        HashSet<Integer> Set2 = new HashSet<>();
        int count = 0;

        for (int i =0;i<N;i++){
            Set1.add(sc.nextInt());
        }
        for (int i =0;i<M;i++){
            Set2.add(sc.nextInt());
        }

        for (int num : Set1){
            if(!Set2.contains(num)){
                count++;
            }
        }
        for (int num : Set2){
            if(!Set1.contains(num)){
                count++;
            }
        }

        System.out.println(count);

    }
}
