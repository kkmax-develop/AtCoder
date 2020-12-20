package BeginnersSelection;

import java.util.*;

public class CardGameForTwo {

    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<Integer> nList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
          nList.add(Integer.parseInt(sc.next()));
        }
        sc.close();
        int alice = 0;
        int bob = 0;

        Collections.sort(nList);
        Collections.reverse(nList);

        for (int i = 0; i < n; i++) {
            if(i%2==0){
                alice+= nList.get(i);
            }else{
                bob += nList.get(i);
            }
        }

        System.out.println(alice - bob);

    }
}
