package Lv_F;

import java.util.Scanner;

public class F_4_10988 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        StringBuffer sb = new StringBuffer(str);
        String reverse = sb.reverse().toString();



        if(str.equals(reverse)){
            System.out.println("1");
        }
        else System.out.println("0");
    }
}
