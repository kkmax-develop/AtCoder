package BeginnersSelection;

import java.util.*;

public class Traveling {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int t = 0;
        int preX = 0;
        int preY = 0;
        int postX = 0;
        int postY = 0;
        int dt = 0;
        int dist = 0;
        int now = 0;

        for (int i = 0; i < n; i++) {
            t = Integer.parseInt(sc.next());
            postX = Integer.parseInt(sc.next());
            postY = Integer.parseInt(sc.next());

            // t秒後までに移動可能な距離の算出
            dt = t - now;

            // 現在地からt秒後の目的地までに必要となる移動距離
            dist = Math.abs(postX - preX) + Math.abs(postY - preY);

            // dist > dtの場合は移動不可
            if (dist > dt) {
                System.out.println("No");
                return;
            }

            // 時間内に到達可能な場合、周囲を回ることによって上手くt秒後に目的地へ到着できるかを判定する
            // x,yを足した値は１秒ごとに偶数⇔奇数となる為、t秒後に目的地座標の偶奇と同一になれるかを判定すればよい
            if ((preX + preY + dt) % 2 != (postX + postY) % 2) {
                System.out.println("No");
                return;
            }
            
            preX = postX;
            preY = postY;
            now = t;

        }

        System.out.println("Yes");

    }
}
