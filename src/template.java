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
        ArrayList<Long> numList = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
          sList.add(sc.next());
        }
        for (int i = 0; i < n; i++) {
          numList.add(sc.nextLong());
        }
        sc.close();

        // ソート
        Collections.sort(numList);
        // 降順ソート
        Collections.sort(numList);
        Collections.reverse(numList);

        // 配列
        ArrayList<Long> nList = new ArrayList<Long>();
        ArrayList<String> strList = new ArrayList<String>();

        // 累乗
        Math.pow(n, 2);

        // 大文字判定
        if(Character.isUpperCase(s.charAt(0))){
          System.out.println( "A" );
        }

        // 出力
        System.out.println("Hello, World!");
    }
}
