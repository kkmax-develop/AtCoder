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

  }
  
  // 最大公約数
  private static long GCD(long a, long b) {
    if (b == 0) {
        return a;
    } else {
        return GCD(b, a % b);
    }
  }
}
