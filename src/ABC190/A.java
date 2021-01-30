package ABC190;

import java.util.*;

public class A {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        if (a == 0 && b == 0) {
            if (c == 0) {
                System.out.println("Aoki");
            } else {
                System.out.println("Takahashi");
            }
            return;
        }

        while (a != 0 && b != 0) {
            if (c == 0) {
                a -= 1;
                c += 1;
            } else {
                b -= 1;
                c -= 1;
            }
        }


        sc.close();

        if (a == 0) {
            System.out.println("Aoki");
        } else {
            System.out.println("Takahashi");
        }

    }
}