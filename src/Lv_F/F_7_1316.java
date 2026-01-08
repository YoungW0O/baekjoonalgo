package Lv_F;

import java.util.Scanner;

public class F_7_1316 {

    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        int A = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i<A;i++){
            if (check()){
                cnt ++;
            }
        }
        System.out.println(cnt);
    }

    public static boolean check (){
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = sc.next();

        for (int i = 0; i<str.length();i++){
            int now = str.charAt(i);

            if(prev != now){

                if(check[now-'a']==false){
                    check[now-'a'] = true;
                    prev = now;
                }

                else {
                    return false;
                }
            }
        }
        return true;
    }
}
