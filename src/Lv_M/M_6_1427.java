package Lv_M;

import java.util.Arrays;
import java.util.Scanner;

public class M_6_1427 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        char[] array = sc.nextLine().toCharArray();

        Arrays.sort(array);

        for (int i = array.length-1; i>=0; i--){
            System.out.print(array[i]);
        }
    }
}
