package ABC186;

import java.util.*;

public class C {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = 0;
        String s_10 = null;
        String s_8 = null;

        for (int i = 1; i <= n; i++) {
            s_10 = Integer.toString(i, 10);
            s_8 = Integer.toString(i, 8);

            if (s_10.contains("7") || s_8.contains("7")) {
                count += 1;
            }

        }

        System.out.println(n - count);

    }
    
    // 模範解答
    private static void modelAnswer(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (judgeContain7(i,10) || judgeContain7(i, 8)) {
                count += 1;
            }
        }

        System.out.println(n - count);

    }
    
    private static boolean judgeContain7(int x,int base) {

        boolean resultFlag = false;
        while(x > 0){
            if(x%base==7){
                resultFlag = true;
                break;
            }
            x /= base;
        }

        return resultFlag;
    }
}

