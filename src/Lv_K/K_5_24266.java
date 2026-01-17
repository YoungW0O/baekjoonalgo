package Lv_K;

import java.io.*;
import java.util.Scanner;

public class K_5_24266 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        br.close();

        bw.write(n*n*n + "\n" + 3);
        bw.flush();
        bw.close();
    }
}
