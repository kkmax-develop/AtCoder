package AISing2020;

import java.util.*;

public class A {
	public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        int ans = 0;
        for (int i = L; i <= R; i++) {
          if (i % d == 0) {
            ans +=1;
          }
        }

        System.out.println(ans);
      
      }
}