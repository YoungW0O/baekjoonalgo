package Lv_E;

import java.util.Scanner;
import java.util.StringTokenizer;

public class E_8_1152 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();

        StringTokenizer st = new StringTokenizer(A," ");

        System.out.println(st.countTokens());

    }
}
