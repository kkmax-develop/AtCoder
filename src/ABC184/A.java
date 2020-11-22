package ABC184;

import java.util.*;

public class A {
    public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        sc.close();

        System.out.println((a*d) - (b*c));

      
    }
}
