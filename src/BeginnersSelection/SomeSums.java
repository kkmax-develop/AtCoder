package BeginnersSelection;

import java.util.*;

public class SomeSums {

    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int ans = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = findSumOfDigits(i);
            if (a <= sum && b >= sum) {
                ans += i;
            }

        }

        System.out.println(ans);

    }

    private static int findSumOfDigits(int n){
        int sum= 0;
        while(n > 0){
            sum += n%10;
            n /=10;
        }
        return sum;
    }
    

}
