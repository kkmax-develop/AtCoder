import java.util.*;
public class template {
  public static void main(String[] args) throws Exception {
    // Scanner
    Scanner sc = null;
    sc = new Scanner(System.in);
    // 数字取得
    int n = sc.nextInt();
    // 文字取得
    String s = sc.next();
    // 行取得
    ArrayList<String> sList = new ArrayList<String>();
    for (int i = 0; i < n; i++) {
      sList.add(sc.next());
    }
    ArrayList<Long> numList = new ArrayList<Long>();
    for (int i = 0; i < n; i++) {
      numList.add(sc.nextLong());
    }
    sc.close();

    // ソート
    Collections.sort(numList);
    // 降順ソート
    Collections.sort(numList);
    Collections.reverse(numList);

    // 最大値取得
    Collections.max(numList);

    // 配列
    ArrayList<Long> nList = new ArrayList<Long>();
    ArrayList<String> strList = new ArrayList<String>();

    // 累乗
    Math.pow(n, 2);

    // 平方根
    Math.sqrt(n);

    // 大文字判定
    if (Character.isUpperCase(s.charAt(0))) {
      System.out.println("A");
    }

    // 出力
    System.out.println("Hello, World!");

    

    // 約数列挙
    for (long i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        numList.add(i);
        if (n / i != i) {
          numList.add(n / i);
        }
      }
    }
    // 3つ以上の数の最大公約数
    long gcd = 0;
    for (int i = 0; i < n; i++) {
        gcd = GCD(gcd, numList.get(i));
    }

  }
  
  // 最大公約数
  private static long GCD(long a, long b) {
    if (b == 0) {
      return a;
    } else {
      return GCD(b, a % b);
    }
  }
  
  //　素因数分解
  private static Map prime_factorization(long n) {
    Map<Long, Long> res = new HashMap<>();
    for (long i = 2; i * i <= n; ++i) {
      if (n % i != 0)
        continue;
      long ex = 0; // 指数

      // 割れる限り割り続ける
      while (n % i == 0) {
        ++ex;
        n /= i;
      }

      // その結果を push
      res.put((Long) i, (Long) ex);
    }

    // 最後に残った数について
    if (n != 1)
      res.put((Long) n, Long.valueOf(1));
    return res;
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
