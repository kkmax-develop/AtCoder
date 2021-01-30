package ABC190;

import java.util.*;

public class C {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Map<Integer, Integer> dishMap = new HashMap<>();
        ArrayList<Integer> aList = new ArrayList<Integer>();
        ArrayList<Integer> bList = new ArrayList<Integer>();
        for (int i = 0; i < m * 2; i++) {
            int key = Integer.parseInt(sc.next());
            if (i % 2 == 0) {
                aList.add(key);
            } else {
                bList.add(key);
            }
            if (dishMap.containsKey(key)) {
                int value = dishMap.get(key);
                dishMap.put(key, value + 1);
            } else {
                dishMap.put(key, 1);
            }
        }
        
        int k = Integer.parseInt(sc.next());
        int c = 0;
        int d = 0;

        for (int i = 0; i < k; i++) {
            c = Integer.parseInt(sc.next());
            d = Integer.parseInt(sc.next());

            if (dishMap.containsKey(c)&&dishMap.containsKey(d)) {
                if(dishMap.get(c) >= dishMap.get(d)){
                    dishMap.remove(c);
                } else {
                    dishMap.remove(d);
                }
            }else if (!dishMap.containsKey(c)&&dishMap.containsKey(d)){
                dishMap.remove(d);
            }else if (dishMap.containsKey(c) && !dishMap.containsKey(d)) {
                dishMap.remove(c);
            }
        }

        sc.close();

        for (int val : dishMap.keySet()) {
            for (int i = 0; i < aList.size(); i++) {
                if (val == aList.get(i)) {
                    aList.remove(i);
                }
            }

            for (int j = 0; j < bList.size(); j++) {
                if (val == bList.get(j)) {
                    bList.remove(j);
                }
            }
        }
        
        if (aList.size() < bList.size()) {
            System.out.println(aList.size());
        } else {
            System.out.println(bList.size());
        }
    }
}