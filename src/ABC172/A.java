package ABC172;
import java.util.*;

public class A {
	public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println( a + (int)Math.pow(a,2) + (int)Math.pow(a,3));
      
      }
}