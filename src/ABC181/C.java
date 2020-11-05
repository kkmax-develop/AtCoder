package ABC181;

import java.util.*;

public class C {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            x.add(sc.nextInt());
            y.add(sc.nextInt());
        }
        sc.close();

        int ax = 0;
        int bx = 0;
        int cx = 0;
        int ay = 0;
        int by = 0;
        int cy = 0;

        // 点Aと点Bの座標の差
        int x1 = 0;
        int y1 = 0;

        // 点Bと点C座標の差
        int x2 = 0;
        int y2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    ax = x.get(i);
                    bx = x.get(j);
                    cx = x.get(k);
                    ay = y.get(i);
                    by = y.get(j);
                    cy = y.get(k);

                    // 点Aと点Bの座標の差
                    x1 = ax - bx;
                    y1 = ay - by;

                    // 点Bと点Cの座標の差
                    x2 = bx - cx;
                    y2 = by - cy;

                    // 0除算考慮のため、両辺にx1x2を掛け、移項して判定
                    // y1/x1 = y2/x2 → x2y1 = x1y2
                    if (x2 * y1 == x1 * y2) {
                        System.out.println("Yes");
                        return;

                    }
                }
            }
        }

        System.out.println("No");

    }

}