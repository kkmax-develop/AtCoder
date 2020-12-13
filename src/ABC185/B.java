package ABC185;


import java.util.*;

public class B {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int max = n;
        int cafeCounter = 1;

        n -= a;

        if (n > 0) {

            for (double i = a+0.5; i < t; i++) {
                if (i >= a && i <= b) {
                    if (max > n) {
                        n += 1;
                    }
                } else {
                    n -= 1;
                }

                if (i > b && cafeCounter < m) {
                    cafeCounter += 1;
                    a = Integer.parseInt(sc.next());
                    b = Integer.parseInt(sc.next());
                    n -= (a-(i+0.5));
                    i = a-0.5;
                }

                if (n == 0) {
                    break;
                }

            }

        }
        
        sc.close();
        
        if (n > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No"); 
        }

    }
}

