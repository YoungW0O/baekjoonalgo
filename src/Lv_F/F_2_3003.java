package Lv_F;

import java.util.Scanner;

public class F_2_3003 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int king = 1;
        int queen = 1;
        int look = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;

        king -= sc.nextInt();
        queen -= sc.nextInt();
        look -= sc.nextInt();
        bishop -= sc.nextInt();
        knight -= sc.nextInt();
        pawn -= sc.nextInt();

        System.out.print(king+" ");
        System.out.print(queen+" ");
        System.out.print(look+" ");
        System.out.print(bishop+" ");
        System.out.print(knight+" ");
        System.out.print(pawn);

    }
}
