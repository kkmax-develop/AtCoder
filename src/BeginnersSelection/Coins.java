package BeginnersSelection;

import java.util.*;

public class Coins {
    
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        sc.close();
        int ans = 0;

        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                for (int k = 0; k <= c; k++) {
                    if (500 * i + 100 * j + 50 * k == x) {
                        ans += 1;
                    }
                }
            }       
        }

        System.out.println(ans);

    }
    
}
