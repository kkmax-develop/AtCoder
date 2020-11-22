package ABC184;

import java.util.*;

public class B {
    public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = sc.nextLong();
        String s = sc.next();
        sc.close();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'o') {
                x += 1;
            } else {
                if (x > 0) {
                    x -= 1;
                }
            }

        }
        
        System.out.println(x);
      
    }
}