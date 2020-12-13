package ABC185;


import java.util.*;

public class A {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        ArrayList<Long> numList = new ArrayList<Long>();
        for (int i = 0; i < 4; i++) {
            numList.add(sc.nextLong());
          }
        sc.close();

        System.out.println(Collections.min(numList));

    }
}
