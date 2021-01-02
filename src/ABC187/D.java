package ABC187;

import java.util.*;

public class D {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<Long> sumList = new ArrayList<Long>();
        long a = 0;
        long b = 0;
        long votes = 0;
        for (int i = 0; i < n; i++) {
            a = Long.parseLong(sc.next());
            b = Long.parseLong(sc.next());
            votes -= a;
            sumList.add((2 * a)+  b);
        }
        sc.close();
        int ans = 0;

        Collections.sort(sumList);
        Collections.reverse(sumList);

        for (int i = 0; i < n; i++) {
            votes += sumList.get(i);
            ans += 1;
            if (votes > 0) {
                break;
            }
        }

        System.out.println(ans);

    }
}
