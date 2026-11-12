import java.util.*;
import java.util.HashSet;
public class Main{
    public static void main(String[] args) {
      HashSet<Character>set = new HashSet<>();
      Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
      
      for(int i = 0;i<s.length();i++){
        set.add(s.charAt(i));
      }
      if(set.size()%2==0){
             System.out.println("CHAT WITH HER!");
      }
      else
        System.out.println("IGNORE HIM!");
    }
}