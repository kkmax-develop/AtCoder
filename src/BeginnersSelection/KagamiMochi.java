package BeginnersSelection;

import java.util.*;

public class KagamiMochi {
    
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<Integer> nList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            nList.add(Integer.parseInt(sc.next()));
        }
        sc.close();
        int ans = 0;
        int before = 0;

        // ソート
        Collections.sort(nList);

        for (int i = 0; i < n; i++) {
            if (nList.get(i) != before) {
                ans += 1;
            }
            before = nList.get(i);
        }

        System.out.println(ans);

    }
    
    // Setを使用した模範解答
    private static void modelAnswer(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Set<Integer> num = new HashSet<>();
        for (int i = 0; i < n; i++) {
            num.add(Integer.parseInt(sc.next()));
        }
        sc.close();

        System.out.println(num.size());

    }
    
}
