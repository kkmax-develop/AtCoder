package AntBeginners;

import java.util.*;

public class ABC175B {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<Long> numList = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
          numList.add(Long.parseLong(sc.next()));
        }
        sc.close();
        int ans = 0;
        long a = 0;
        long b = 0;
        long c = 0;

        Collections.sort(numList);

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    a = numList.get(i);
                    b = numList.get(j);
                    c = numList.get(k);
                    if (a != b && b != c && a != c && a+b > c) {
                        ans += 1;
                    }
                }
            }

        }

        System.out.println(ans);

    }
}
