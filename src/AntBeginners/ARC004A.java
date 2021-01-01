package AntBeginners;

import java.util.*;

public class ARC004A {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        ArrayList<Integer> xList = new ArrayList<Integer>();
        ArrayList<Integer> yList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            xList.add(Integer.parseInt(sc.next()));
            yList.add(Integer.parseInt(sc.next()));
        }
        sc.close();
        double ans = 0;
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        double dis = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                x1 = xList.get(i);
                y1 = yList.get(i);
                x2 = xList.get(j);
                y2 = yList.get(j);

                dis = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
                
                if (dis > ans) {
                    ans = dis;
                }
            }
        }

        System.out.println(ans);

    }
}
