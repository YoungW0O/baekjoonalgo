package Lv_P;

import java.io.*;
import java.util.Arrays;

public class P_8_17103 {

    static final int MAX = 1000000;
    public static boolean []prime;

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        get_prime();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            bw.write(countPartition(n) + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
    public static void get_prime(){
        prime = new boolean[MAX + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int i = 2; i * i <= MAX; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    prime[j] = false;
                }
            }
        }
    }

    static int countPartition(int n) {
        int cnt = 0;

        for (int i = 2; i <= n / 2; i++) {
            if (prime[i] && prime[n - i]) {
                cnt++;
            }
        }
        return cnt;
    }
}
