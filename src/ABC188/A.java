package ABC188;

import java.util.*;

public class A {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        sc.close();
        
        if (Math.min(x, y) + 3 > Math.max(x, y)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}
