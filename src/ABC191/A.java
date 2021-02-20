package ABC191;

import java.util.*;

public class A {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int v = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        int s = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        sc.close();
        if (v * t > d || v * s < d) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}