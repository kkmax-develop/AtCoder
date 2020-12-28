package BeginnersSelection;

import java.util.*;

public class DayDream {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String delstr = "";
  
        while (true) {
               
            if(s.endsWith("eraser")){
                delstr = "eraser";
            }else if(s.endsWith("erase")){
                delstr = "erase";
            }else if(s.endsWith("dreamer")){
                delstr = "dreamer";
            }else if(s.endsWith("dream")){
                delstr = "dream";
            } else {
                break;
            }
            
            s = s.substring(0,s.length() - delstr.length());
            
            if (s.length() == 0) {
                System.out.println("YES");
                return;
            }
        }
        
        System.out.println("NO");

    }
}