package Lv_O;

import java.io.*;
import java.util.HashSet;



public class O_8_11478 {
    public static void main (String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        br.close();

        HashSet<String> Set1 = new HashSet<>();

        for(int i = 0; i < S.length(); i++) {
            for(int j = i+1; j <= S.length(); j++){
                Set1.add(S.substring(i, j));
            }
        }
        System.out.println(Set1.size());
    }
}
