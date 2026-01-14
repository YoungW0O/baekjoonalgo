package Lv_H;

import java.util.Scanner;

public class H_3_2720 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i< T; i++){
            int C = sc.nextInt();

            int Quarter = C/25;
            C %= 25;
            int Dime = C/10;
            C %= 10;
            int Nickel = C/5;
            C %= 5;
            int Penny = C;

            System.out.println(Quarter+" "+Dime+" "+Nickel+" "+Penny);
        }
    }
}
