package ABC187;

import java.util.*;

public class C {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        Set<String> stringSet = new HashSet<>();
        String s = null;
        for (int i = 0; i < n; i++) {
            s = sc.next();
            if (s.substring(0, 1).equals("!")) {
                if (stringSet.contains(s.substring(1, s.length()))) {
                    System.out.println(s.substring(1, s.length()));
                    return;
                }    
            } else {
                if (stringSet.contains("!"+s)) {
                    System.out.println(s);
                    return;
                } 
            }
            stringSet.add(s);
        }
        sc.close();

        System.out.println("satisfiable");

    }
}