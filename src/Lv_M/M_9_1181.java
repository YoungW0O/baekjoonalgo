package Lv_M;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class M_9_1181 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String [] array = new String[N];

        sc.nextLine();

        for (int i = 0; i<N; i++){
            array[i] = sc.nextLine();
        }

        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }
                else {
                    return o1.length() - o2.length();
                }
            }
        });

        System.out.println(array[0]);

        for (int i =1; i<N; i++){
            if (!array[i].equals(array[i-1])){
                System.out.println(array[i]);
            }
        }
    }
}
