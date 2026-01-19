package Lv_L;

import java.util.Scanner;

public class L_2_2231 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        int result = 0;

        for (int i =0;i<A;i++){

            int number = i;
            int sum = 0;

            while (number !=0){
                sum += number%10;
                number /= 10;
            }

            if (sum +i ==A){
                result =i;
                break;
            }
        }
        System.out.println(result);
    }
}
