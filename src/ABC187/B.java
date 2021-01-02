package ABC187;

import java.util.*;

public class B {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        coordinate cd[] = new coordinate[n];

        for (int i = 0; i < n; i++) {
            cd[i] = new coordinate(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
        }
        sc.close();
        int ans = 0;
        double slope = Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                slope = (double)(cd[j].y - cd[i].y)/(cd[j].x - cd[i].x);
                if(slope >= -1 && slope <= 1){
                    ans += 1;
                }
            }
        }

        System.out.println(ans);

    }
}

class coordinate {
    int x;
    int y;

    coordinate(int x,int y){
        this.x = x;
        this.y = y;
    }
}