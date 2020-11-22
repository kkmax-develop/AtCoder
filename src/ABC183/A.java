package ABC183;

import java.util.*;

public class A {
    public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        long x = sc.nextLong();
        sc.close();

        if (x >= 0) {
            System.out.println(x);
          } else {
            System.out.println(0);
          }
      
    }
}
