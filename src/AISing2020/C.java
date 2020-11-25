package AISing2020;

import java.util.*;

public class C {

    public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 0;
        int sqrtN = (int)Math.sqrt(N);
        int ans[] = new int[N];
        sc.close();
        for (int i = 1; i <= sqrtN; i++) {
            for (int j = 1; j <= sqrtN; j++) {
                for (int k = 1; k <= sqrtN; k++) {
                    num = i * i + j * j + k * k + i * j + j * k + k * i;
                    if (num <= N) {
                        ans[num-1] += 1;
                    }
                }
            }
        }

        for (int i = 0; i < N ; i++) {
            System.out.println(ans[i]);
          }
      
      }
    
}
