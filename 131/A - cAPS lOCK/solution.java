import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
 
        if(s.equals(s.toUpperCase())) {
            System.out.println(s.toLowerCase());
        }
 
        else if(Character.isLowerCase(s.charAt(0)) &&
                s.substring(1).equals(s.substring(1).toUpperCase())) {
 
            s = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
            System.out.println(s);
        }
 
        else {
            System.out.println(s);
        }
    }
}