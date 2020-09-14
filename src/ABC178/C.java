package ABC178;

import java.util.*;

public class C {
    
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        long s = sc.nextLong();
        sc.close();

        long mod = (long) Math.pow(10, 9) + 7;

        // 全ての組み合わせ数
        long all = powmod(10, s, mod);

        // 0がない数列の数
        long notexist0 = powmod(9, s, mod);

        // 9がない数列の数
        long notexist9 = powmod(9, s, mod);

        // 0、9が両方ともない数列の数
        long notexistBoth = powmod(8, s, mod);

        // 0、9少なくとも一方は存在しない配列の数
        long notexistOne = (notexist0 + notexist9 - notexistBoth);

        // 全ての組み合わせ - 0、9少なくとも一方は存在しない配列の数 = 0、9がともに存在する配列の数
        long total = (all - notexistOne) % mod;

        // Javaは負の数の剰余が負の数で返ってきてしまう為、正の数で返すためにmodを足してもう一度剰余を出す
        System.out.println((total + mod)%mod);

    }

    public static long powmod(long x, long y, long mod) {
        long total = 1;
        for (int i = 0; i < y; i++) {
            total = (total*x) % mod;
        }
        return total;
        
    }
}