package Lv_B;

import java.util.Scanner;

public class B_2_9498 {

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();

    if(A>=90){
        System.out.println("A");
    } else if (A>79) {
        System.out.println("B");
    } else if (A>69) {
        System.out.println("C");
    } else if (A>59) {
        System.out.println("D");
    } else System.out.println("F");

    }
}
