package Lv_E;

import java.util.Scanner;

public class E_6_10809 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int [] arr = new int[26];

        for(int i = 0; i<arr.length; i++){
            arr[i] = -1;
        }

        String A = sc.next();

        for (int i =0; i<A.length(); i++){
            char ch = A.charAt(i);

            if(arr[ch-'a']==-1){
                arr[ch-'a'] = i;
            }
        }

        for (int val : arr){
            System.out.print(val+" ");
        }
    }
}
