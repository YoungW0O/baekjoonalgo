package Lv_O;

import java.util.*;

public class O_3_7785 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        HashSet<String> Set_1 = new HashSet<>();

        for (int i = 0; i<N; i++){
            String human = sc.next();
            String value = sc.next();

            if (value.equals("enter")){
                Set_1.add(human);
            }
            if (value.equals("leave")){
                Set_1.remove(human);
            }
        }

        ArrayList<String> list = new ArrayList<>(Set_1);
        Collections.sort(list);

        for (int i =list.size()-1; i>=0;i--){
            System.out.print(list.get(i)+"\n");
        }
    }
}
