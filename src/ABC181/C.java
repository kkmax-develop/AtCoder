package ABC181;

import java.util.*;

public class C {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = 0;
        long b = 0;
        long ans = 0;
        ArrayList<Long> numList = new ArrayList<Long>();

        for (int i = 0; i < n; i++) {
            a = sc.nextLong();
            b = sc.nextLong();
            numList.add(GCD(a, b));

        }
        sc.close();

        for (int i = 0; i < numList.size(); i++) {
            System.out.println(numList.get(i));
        }

        //System.out.println(ans);

    }

    private static long GCD(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}