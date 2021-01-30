package ABC190;

import java.util.*;

public class B {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int s = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            x = Integer.parseInt(sc.next());
            y = Integer.parseInt(sc.next());

            if (x < s && y > d) {
                System.out.println("Yes");
                return;
            }
          }


        sc.close();

        System.out.println("No");

    }
}