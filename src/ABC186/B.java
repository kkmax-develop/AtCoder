package ABC186;

import java.util.*;

public class B {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int ans = 0;
        ArrayList<Integer> nList = new ArrayList<Integer>();
        for (int i = 0; i < h*w; i++) {
            nList.add(sc.nextInt());
        }
        sc.close();
        int min = Collections.min(nList);

        for (int i = 0; i < h*w; i++) {
            if (nList.get(i) > min) {
                ans += nList.get(i) - min;
            }
        }

        System.out.println(ans);

    }
}

