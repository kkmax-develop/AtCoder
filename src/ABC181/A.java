package ABC181;

import java.util.*;

public class A {
    public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();

        if (n%2 == 0) {
            System.out.println("White");
          } else {
            System.out.println("Black");
          }
      
    }
}
