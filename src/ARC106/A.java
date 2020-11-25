package ARC106;

import java.util.*;

public class A {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        long three = 3;
        long five = 5;

        for (int i = 1; i < 38; i++) {
            for (int j = 1; j < 26; j++) {
                if (three + five == n) {
                    System.out.println(i + " " + j);
                    return;
                }
                five *= 5;
            }
            three *= 3;
            five = 5;
        }

        System.out.println(-1);

    }
}
