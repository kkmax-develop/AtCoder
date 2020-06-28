package ABC172;
import java.util.*;

public class C {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        ArrayList<Long> aList = new ArrayList<Long>();
        ArrayList<Long> bList = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            aList.add(sc.nextLong());
        }
        for (int i = 0; i < m; i++) {
            bList.add(sc.nextLong());
        }
        sc.close();
        Collections.sort(aList);
        Collections.sort(bList);
        int ans = 0;
        int maxLoop = n + m;
        if (aList.get(0) >= k && bList.get(0) >= k) {
            System.out.println(ans);
        }else{
            for (int i = 0; i < maxLoop; i++) {
                if (k <= 0) {
                    break;
                }
                if (n > 0 && m > 0) {
                    if (aList.get(0) >= bList.get(0)) {
                        k -= aList.get(0);
                        aList.remove(0);
                        n -= 1;

                    } else {
                        k -= bList.get(0);
                        bList.remove(0);
                        m -= 1;
                    }
                } else if (n == 0 && m > 0) {
                    k -= bList.get(0);
                    bList.remove(0);
                    m -= 1;
                } else if (n > 0 && m == 0) {
                    k -= aList.get(0);
                    aList.remove(0);
                    n -= 1;
                }
                ans += 1;
            }
            System.out.println(ans);
        }
    }
}