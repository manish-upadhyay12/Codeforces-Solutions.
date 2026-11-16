import java.util.*;
public class Main {
    public static void main(String[] args) {
Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        String st = "hello";
        int k = 0;
        for(int i  = 0;i<s.length();i++){
            char ch1= s.charAt(i);
            char ch2 = st.charAt(k);
 
            if(ch1== ch2){
                k++;
            }
            if(k== st.length()){
                System.out.println("YES");
                return;
            }
        }
        
        System.out.println("NO");
    }
}