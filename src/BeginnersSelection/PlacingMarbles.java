package BeginnersSelection;

import java.util.*;

public class PlacingMarbles {
    
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int ans = 0;
        String s = sc.next();
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == '1') {
                ans += 1;
            }

        }
        sc.close();

        System.out.println(ans);

    }
    
}
