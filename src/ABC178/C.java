package ABC178;

import java.math.*;
import java.util.*;

public class C {
    
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        long s = sc.nextLong();
        sc.close();
        BigDecimal ans = new BigDecimal(2);
        BigDecimal bigDec1 = new BigDecimal(10);
        BigDecimal bigDec2 = new BigDecimal(Math.pow(10, 9) + 7);
        int powNum = (int)s - 2;

        if (s != 2) {
            bigDec1 = bigDec1.pow(powNum);
            ans = bigDec1.remainder(bigDec2);       
        }

        System.out.println(ans);

    }
}