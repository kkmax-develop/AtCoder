package ABC180;

import java.util.*;

public class C {
    public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        long n = sc.nextLong();
        ArrayList<Long> numList = new ArrayList<Long>();

        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                numList.add(i);
                if (n / i != i) {
                    numList.add(n / i);
                }
            }
        }
        sc.close();

        Collections.sort(numList);
        
        for (int j = 0; j < numList.size(); j++) {
            System.out.println(numList.get(j));
        }
      
    }
}
