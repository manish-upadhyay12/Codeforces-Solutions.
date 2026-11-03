import java.util.Scanner;
 
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 
 
    int t = sc.nextInt();
 
    while (t > 0) {
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.next();
 
        int left = 0;
        int right = s.length() - 1;
 
        while (left < right) {
 
            int ch1 = s.charAt(left);
            int ch2 = s.charAt(right);
 
            if (ch1 == ch2) {
                break;
            } else {
                left++;
                right--;
            }
        }
 
        System.out.println(Math.max(0, right - left + 1));
 
        t--;
    }
 
    
}
 
}