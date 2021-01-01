package AntBeginners;

import java.util.*;

public class ABC079C {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
	    String s = sc.next();
        String ans = "";
        long total = 0;
        sc.close();
        
        // 2N-1までインクリメントすることで部分集合を全探索できる
		for(int bit = 0; bit < Math.pow(2,3); bit++){
			String num = "";
            for (int i = 0; i < 3; i++) {
                num = s.split("")[3-i];
                // ビットが立っている場合は+する。
                if ((bit >> i & 1) == 1) {
                    total += Long.parseLong(num);
                    ans = "+" + num + ans;
                    // 立っていない場合は-する。
                } else {
                    total -= Long.parseLong(num);
                    ans = "-" + num + ans;

                }
            }
            
            //先頭の数字をプラスする
            total += Long.parseLong(s.split("")[0]);
            ans = s.split("")[0] + ans;
            
            if (total == 7) {
                System.out.println(ans + "=7");
                return;
            }
            total = 0;
            ans = "";
		}
	}
}