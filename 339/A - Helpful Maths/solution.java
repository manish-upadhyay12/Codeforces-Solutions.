import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.nextLine();
        int n = s.length();
 
        if (n == 1) {
            System.out.println(s);
            return;
        }
 
        int len = (n / 2) + 1;
        char[] cha = new char[len];
 
        int k = 0;
 
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                continue;
            } else {
                cha[k++] = s.charAt(i);
            }
        }
 
        Arrays.sort(cha);
 
        String res = "";
 
        for (int i = 0; i < cha.length; i++) {
            res += cha[i];
 
            if (i != cha.length - 1) {
                res += '+';
            }
        }
 
        System.out.println(res);
    }
}