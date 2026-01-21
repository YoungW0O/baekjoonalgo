package Lv_O;

import java.util.*;

public class O_6_1764 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        HashSet<String> Set1 = new HashSet<>();
        HashSet<String> Set2 = new HashSet<>();
        int count = 0;

        for (int i = 0; i<N;i++){
            Set1.add(sc.next());
        }
        for (int i = 0; i<M;i++){
            String key = sc.next();
            if (Set1.contains(key)){
                count++;
                Set2.add(key);
            }
        }

        ArrayList<String> list = new ArrayList<>(Set2);
        Collections.sort(list);

        System.out.println(count);
        for (int i =0; i<list.size();i++){
            System.out.print(list.get(i)+"\n");
        }
    }
}
