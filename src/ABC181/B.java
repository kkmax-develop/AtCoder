package ABC181;

import java.util.*;

public class B {
    public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = 0;
        long b= 0;
        long ans = 0;
        long work= 0;
        long a2= 0;

        for (int i = 0; i < n; i++) {
            a = sc.nextLong();
            b = sc.nextLong();
            if (a == 1) {
                ans += (b * (b + 1)) / 2;
            } else {
                a2 = a - 1; 
                work = ((b * (b + 1)) / 2) - ((a2 * (a2 + 1)) / 2);
                ans += work;
                
            }

        }
        sc.close();
        
        System.out.println(ans);
      
    }
}
