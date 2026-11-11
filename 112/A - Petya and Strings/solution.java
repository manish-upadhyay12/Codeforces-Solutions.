import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        String s1 = sc.nextLine();
        String s2= sc.nextLine();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
 
     
        for(int i   = 0;i<s1.length();i++){
          char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(ch1 <ch2){
                 System.out.print(-1);
                return;
            }
            else if(ch2<ch1) {
                System.out.print(1);
                return;
            }
            
        }
        System.out.print(0);      
       
 
 
    }
}