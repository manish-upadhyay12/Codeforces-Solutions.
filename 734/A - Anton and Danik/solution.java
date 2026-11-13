import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        String s = sc.next();
 
        int a = 0;
        int d = 0;
 
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
 
            if (ch == 'A') {
                a++;
            } else if (ch == 'D') {
                d++;
            }
        }
 
        if (a > d) {
            System.out.println("Anton");
        } else if (d > a) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}