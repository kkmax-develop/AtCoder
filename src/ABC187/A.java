package ABC187;

import java.util.*;

public class A {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();
        a = findSumOfDigits(a);
        b = findSumOfDigits(b);

        System.out.println(Math.max(a, b));

    }

      // 各桁の和を計算
    private static int findSumOfDigits(int n){
    int sum= 0;
    while(n > 0){
        sum += n%10;
        n /=10;
    }
    return sum;
  }
}