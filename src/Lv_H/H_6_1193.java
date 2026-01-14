package Lv_H;

import java.util.Scanner;

public class H_6_1193 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int cross_ct=1;
        int pre_cross_ct=0;

        while(true) {

            if (X<=cross_ct+pre_cross_ct) {

                if(cross_ct%2==1) {
                    System.out.print((cross_ct-(X-pre_cross_ct-1))+"/"+(X-pre_cross_ct));
                    break;
                }
                else {
                    System.out.print((X-pre_cross_ct)+"/"+(cross_ct-(X-pre_cross_ct-1)));
                    break;
                }

            }

            else {
                pre_cross_ct += cross_ct;
                cross_ct++;
            }
        }
    }

}