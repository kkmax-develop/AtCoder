package ABC186;

import java.util.*;

public class C {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int ans = 0;
        int count = 0;
        String s_10 = null;
        String s_8 = null;
        
        for (int i = 1; i <= n; i++) {
            s_10 = Integer.toString(i, 10);
            s_8 = Integer.toString(i, 8);
            
            if (s_10.contains("7")||s_8.contains("7")) {
                count += 1;
            }

        }

        System.out.println(n-count);

    }
}

