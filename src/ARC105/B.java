package ARC105;

import java.util.*;

public class B {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> numList = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            numList.add(sc.nextLong());
        }
        sc.close();
        boolean checkFlag = true;
        long max = 0;
        long min = 0;

        while (checkFlag) {
            Collections.sort(numList);
            Collections.reverse(numList);
            max = numList.get(0);
            min = numList.get(numList.size()-1);
            if (max == min){
                checkFlag = false;
            } else {
                numList.set(0, max - min);
                for (int i = 1; i < numList.size(); i++) {
                    if (max == numList.get(i)) {
                        numList.set(i, max - min);
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
