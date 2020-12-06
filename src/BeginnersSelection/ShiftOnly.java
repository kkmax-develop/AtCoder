package BeginnersSelection;

import java.util.*;

public class ShiftOnly {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> numList = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
          numList.add(sc.nextLong());
        }
        sc.close();
        int ans = 0;
        Boolean breakFlag = true;
        while(breakFlag){
            for (int i = 0; i < n; i++) {
                if (numList.get(i) % 2 != 0) {
                    breakFlag = false;
                    break;
                }
                numList.set(i,numList.get(i) / 2);
            }
            if(breakFlag){
                ans += 1;
            }
        }

        System.out.println(ans);

    }
    
}
