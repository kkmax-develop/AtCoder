package ARC105;

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

        String ansStr = "No";

        if (a == b+c+d) {
            ansStr = "Yes";
        }
        if (a+b == c+d) {
            ansStr = "Yes";
        }
        if (a+c == b+d) {
            ansStr = "Yes";
        }
        if (a+d == b+c) {
            ansStr = "Yes";
        }
        if (a+b+c == d) {
            ansStr = "Yes";
        }
        if (a+b+d == c) {
            ansStr = "Yes";
        }
        if (a + c + d == b) {
            ansStr = "Yes";
        }
        if (b+c+d == a) {
            ansStr = "Yes";
        } 
        System.out.println(ansStr);
      
    }
}