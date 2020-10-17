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
            if (x / a >= b) {
                break;
            }
            x *= a;
            ans += 1;
        }
        ans = ans + (y-x)/b;

        System.out.println(ans);
      
    }
}
    
