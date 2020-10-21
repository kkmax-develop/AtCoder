package ARC105;

import java.util.*;

public class B {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans = GCD(ans, sc.nextLong());
        }
        sc.close();
        System.out.println(ans);
    }
    
    private static long GCD(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}
