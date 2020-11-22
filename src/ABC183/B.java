package ABC183;

import java.util.*;

public class B {
    public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        double sx = sc.nextDouble();
        double sy = sc.nextDouble();
        double gx = sc.nextDouble();
        double gy = sc.nextDouble();
        sc.close();

        double ans = 0;

        // G座標の反転
        double gy2 = gy * -1;

        // 傾きの算出
        double slope = (gy2 - sy) / (gx - sx);

        // 切片の算出
        double intercept = sy - (slope * sx);

        // ｙ = 0となるx座標を算出
        ans = (intercept * -1) * (1 / slope);

        System.out.println(ans);
      
    }
}
