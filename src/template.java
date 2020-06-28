import java.util.*;
public class template {
    public static void main(String[] args) throws Exception {
        Scanner sc = null;
        sc = new Scanner(System.in);
        // // 数字取得
        // int a = sc.nextInt();
        // // 文字取得
        // String s = sc.next();
        // 行取得
        ArrayList<String> sList = new ArrayList<String>();
        while(sc.hasNext()){
          sList.add(sc.next());
        }
        sc.close();
        // 出力
        System.out.println("Hello, World!");
    }
}
