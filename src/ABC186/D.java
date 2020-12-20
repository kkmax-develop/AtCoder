package ABC186;

import java.util.*;

public class D {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        ArrayList<Long> numList = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
          numList.add(Long.parseLong(sc.next()));
        }
        sc.close();
        long ans = 0;
        long sum = 0;

        // ソート
        Collections.sort(numList);

        for (int i = 0; i < n; i++) {
            // 最大値の合計を加算
            ans += numList.get(i) * i;
            // 累積和を減産
            ans -= sum;
            // 累積和の更新
            sum += numList.get(i);
        }
        System.out.println(ans);

    }
}
