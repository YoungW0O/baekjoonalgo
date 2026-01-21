package Lv_O;

import java.util.HashSet;
import java.util.Scanner;

public class O_2_14425 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        HashSet<String> set_1 = new HashSet<>();
        int count = 0;

        for (int i =0;i<N;i++){
            set_1.add(sc.next());
        }
        for(int i=0; i<M;i++){
            if(set_1.contains(sc.next())){
                count++;
            }
        }
        System.out.print(count);
    }
}
