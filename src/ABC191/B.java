package ABC191;

import java.util.*;

public class B {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int a = 0;
        ArrayList<Integer> aList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a = Integer.parseInt(sc.next());
            if (a != x) {
                aList.add(a);
            }
        }
        sc.close();

        if (aList.size() > 0) {
            for (int i = 0; i < aList.size(); i++) {
                if (aList.size() - 1 == i) {
                    System.out.print(aList.get(i));
                } else {
                    System.out.print(aList.get(i)+" ");
                }
            } 
        } else {
            System.out.print(" ");
        }

    }
}