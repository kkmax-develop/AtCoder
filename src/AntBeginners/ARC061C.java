package AntBeginners;

import java.util.*;

public class ARC061C {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
	    String s = sc.next();
		int n = s.length();
        long total = 0;
        sc.close();
        
        // 2N-1までインクリメントすることで部分集合を全探索できる
        // 10桁の場合、入れるケースは最大9つとなるので部分集合の数はN-1となる。
		for(int bit = 0; bit < Math.pow(2,n-1); bit++){
			String num = "";
			for(int i = 0; i < n; i++){
                num += s.split("")[i];
                
                // ビットが立っている場合(+記号のある場合)そこまでの数を足す
				if((bit>> i & 1) == 1){
					total += Long.parseLong(num);
					num = "";
				}
			}
			total += Long.parseLong(num);
			num = "";
		}
		System.out.println(total);
	}
}