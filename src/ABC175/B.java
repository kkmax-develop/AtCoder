package ABC175;

import java.util.*;

public class B {
    
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> numList = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            numList.add(sc.nextLong());
        }
        sc.close();
        long a = 0;
        long b = 0;
        long c = 0;
        int ans = 0;

        for (int i = 0; i < numList.size()-2; i++) {
            for (int j = i+1; j < numList.size()-1; j++) {
                for (int k = j+1; k < numList.size(); k++) {
                    a = numList.get(i);
                    b = numList.get(j);
                    c = numList.get(k);
                    if (a + b > c && b + c > a && a + c > b && (a!=b&&b!=c&&a!=c)) {
                        ans += 1;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}