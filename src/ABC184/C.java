package ABC184;

import java.util.*;

public class C {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        sc.close();

        // 0手の場合
        if (r1 == r2 && c1 == c2) {
            System.out.println(0);
            return;
        }
        
        // 1手の場合
        if ((r1 + c1) == (r2 + c2) || (r1 - c1) == (r2 - c2) || (Math.abs(r1 - r2) + Math.abs(c1 - c2) <= 3)) {
            System.out.println(1);
            return;
        }
        
        // 2手の場合(A+B:斜め+斜め)
        if ((r1 + c1) % 2 == (r2 + c2) % 2) {
            System.out.println(2);
            return;
        }
        
        // 2手の場合(C+C:マンハッタン距離×２)
        if (Math.abs(r1 - r2) + Math.abs(c1 - c2) <= 6) {
            System.out.println(2);
            return;
        }

        // 2手の場合(A+C or B+C:斜め+マンハッタン距離)
        // マンハッタン距離が3以下となる座標を列挙
        // 正方形の部分
        for (int i = r1 - 2; i <= r1 + 2; i++) {
            for (int j = c1 - 2; j <= c1 + 2; j++) {
                // マンハッタン距離３以下の座標から斜め移動で目的地へ移動できるかをチェック
                if ((i + j) == (r2 + c2) || (i - j) == (r2 - c2)) {
                    System.out.println(2);
                    return;
                }
            }
        }

        //残りの４座標をチェック
        if (((r1 + 3) + c1) == (r2 + c2) || ((r1 + 3) - c1) == (r2 - c2)) {
            System.out.println(2);
            return;
        }
        if ((r1+ (c1+3)) == (r2 + c2) || (r1 - (c1+3)) == (r2 - c2)) {
            System.out.println(2);
            return;
        }
        if (((r1-3) + c1) == (r2 + c2) || ((r1-3) - c1) == (r2 - c2)) {
            System.out.println(2);
            return;
        }
        if ((r1 + (c1 - 3)) == (r2 + c2) || (r1 - (c1 - 3)) == (r2 - c2)) {
            System.out.println(2);
            return;
        }
        
        System.out.println(3);

    }
}
