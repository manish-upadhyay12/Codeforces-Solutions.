import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
      char ch = Character.toUpperCase(s.charAt(0));    
      String st = "";
      st +=ch;
      for(int i = 1;i<s.length();i++){
        st+=s.charAt(i);
      }
        System.out.println(st);
    }
}