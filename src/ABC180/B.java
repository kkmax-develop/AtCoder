package ABC180;

import java.util.*;

public class B {
    public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = 0;
        double u = 0;
        long tmp = 0;
        long abs = 0;
        ArrayList<Long> numList = new ArrayList<Long>();

        for (int i = 0; i < n; i++) {
            tmp = sc.nextLong();
            abs = Math.abs(tmp);
            m += abs;
            u += Math.pow(abs, 2);
            numList.add(abs);
        }
        sc.close();
        
        System.out.println(m);
        System.out.println(Math.sqrt(u));
        System.out.println(Collections.max(numList));
      
    }
}
