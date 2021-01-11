package ABC188;

import java.util.*;

public class B {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long sum = 0;
        int a = 0;
        int b = 0;
        ArrayList<Integer> aList = new ArrayList<Integer>();
        ArrayList<Integer> bList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            aList.add(Integer.parseInt(sc.next()));
        }

        for (int i = 0; i < n; i++) {
            bList.add(Integer.parseInt(sc.next()));
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            a = aList.get(i);
            b = bList.get(i);
            sum += a * b;
        }
        
        if (sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}
