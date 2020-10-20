package ABC180;

import java.util.*;

public class D {
    public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        sc.close();
        long ans = 0;

        while (x < y) {
            // オーバーフロー対策
            if (y / a < x) {
                break;
            }
            // 一発で進化してしまうケース
            if (x*a >= y) {
                break;
            }
            if (x  >= b / (a - 1)) {
                break;
            }
            x *= a;
            ans += 1;
        }
        ans +=  (y-x-1)/b;

        System.out.println(ans);
      
    }
}
    
