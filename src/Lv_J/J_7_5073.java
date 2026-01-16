package Lv_J;

import java.util.Arrays;
import java.util.Scanner;

public class J_7_5073 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int[] A = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

            Arrays.sort(A);

            if (A[0] == 0 || A[1] == 0 || A[2] == 0) break;

            if (A[2] >= A[0] + A[1]){
                System.out.println("Invalid");
            }
            else if (A[0] == A[1] && A[1] == A[2]) {
                System.out.println("Equilateral");
            } else if (A[0] == A[1] || A[1] == A[2] || A[0] == A[2]) {
                System.out.println("Isosceles");
            } else System.out.println("Scalene");
        }
    }
}