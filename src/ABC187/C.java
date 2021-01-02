package ABC187;

import java.util.*;

public class C {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        Set<String> stringSet = new HashSet<>();
        ArrayList<String> sList = new ArrayList<String>();
        String s = null;
        for (int i = 0; i < n; i++) {
            s = sc.next(); 
            sList.add(s);
            stringSet.add(s);
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            if (stringSet.contains("!" + sList.get(i))) {
                System.out.println(sList.get(i));
                return;
            }
        }

        System.out.println("satisfiable");

    }
}