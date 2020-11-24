package ABC174;

import java.util.*;

public class C {
	public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        int ans = 1;
        boolean breakFlag = false;
        Set<Integer> set = new HashSet<Integer>();
        int x = 7%k;
        while (!set.contains(x)) {
            if (x == 0) {
                breakFlag = true;
                break;
            }
            set.add(x);
            x = (x * 10 + 7) % k;
            ans += 1;
        }
        if (breakFlag) {
            System.out.println(ans);
        } else {
            System.out.println("-1");
        }
      }
}