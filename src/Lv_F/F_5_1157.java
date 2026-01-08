package Lv_F;

import java.util.Scanner;

public class F_5_1157 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int [] arr = new int[26];
        String A = sc.next();

        for (int i = 0; i<A.length(); i++){

            if('A'<= A.charAt(i) && A.charAt(i) <='Z'){
                arr[A.charAt(i)-'A']++;
            }
            else {
                arr[A.charAt(i)-'a']++;
            }
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i<26; i++){

            if (max<arr[i]){
                max = arr[i];
                ch = (char) (i+65);
            } else if (max == arr[i]) {
                ch='?';
            }
        }

        System.out.println(ch);
    }
}
