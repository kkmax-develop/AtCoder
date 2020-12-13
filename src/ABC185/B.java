package ABC185;

import java.util.*;

public class B {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        int a = 0;
        int b = 0;
        int max = n;
        int now = 0;

        for (int i = 0; i < m; i++) {
            
            a = Integer.parseInt(sc.next());
            b = Integer.parseInt(sc.next());

            // カフェまでのバッテリー消費
            n -= a - now;
            now = a;

            // バッテリーが0になったらbreak
            if(n <= 0){
                break;
            }

            // カフェでのバッテリー充電
            n += b-a;
            if(n>max){
                n = max;
            }

            now = b;

        }
        
        sc.close();

        // 家までのバッテリー消費
        n -= t - now;
        
        if (n > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No"); 
        }

    }
}

