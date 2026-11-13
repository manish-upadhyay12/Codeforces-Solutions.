import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.nextLine();
        String t = sc.nextLine();
 
        int left = 0;
        int right = t.length() - 1;
 
        if (s.length() != t.length()) {
            System.out.println("NO");
            return;
        }
 
        while (left < s.length() && right >= 0) {
 
            char ch1 = s.charAt(left);
            char ch2 = t.charAt(right);
 
            if (ch1 != ch2) {
                System.out.println("NO");
                return;
            }
 
            left++;
            right--;
        }
 
        System.out.println("YES");
    }
}