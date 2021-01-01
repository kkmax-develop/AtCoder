package AntBeginners;

import java.util.*;

public class ABC051B {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        int s = Integer.parseInt(sc.next());
        sc.close();
        int ans = 0;

        for (int x = 0; x <= k; x++) {
            for (int y = 0; y <= k; y++) {

                if (s - (x + y) <= k && s - (x + y) >= 0) {
                    ans += 1;
                }
            }
        }

        System.out.println(ans);

    }
}
