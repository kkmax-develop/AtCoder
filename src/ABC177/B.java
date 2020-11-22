package ABC177;

import java.util.*;

public class B {
    
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();
        int ans = t.length();
        int diff = 0;

        if (s.length() >= t.length()) {
            for (int i = 0; i <= s.length() - t.length(); i++) {
                for (int j = 0; j < t.length(); j++) {
                    if (t.charAt(j) != s.charAt(i+j)) {
                        diff += 1;
                    }
                }
                ans = Math.min(ans, diff);
                diff = 0;
    
            }         
        } else {
            ans = 0;
        }
        System.out.println(ans);

    }
}