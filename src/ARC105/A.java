package ARC105;

import java.util.*;

public class A {
    public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        ArrayList<Long> numList = new ArrayList<Long>();
        for (int i = 0; i < 4; i++) {
          numList.add(sc.nextLong());
        }
        sc.close();

        // ソート A≦B≦C≦D
        Collections.sort(numList);

        long a = numList.get(0);
        long b = numList.get(1);
        long c = numList.get(2);
        long d = numList.get(3);

        String ansStr = "No";

        // 不等号の関係から、試すのはA+D=B+CとD=A+B+Cのみで十分となる

        if (a+d == b+c) {
            ansStr = "Yes";
        }

        if (d == a+b+c) {
            ansStr = "Yes";
        }
        
        System.out.println(ansStr);
      
    }
}