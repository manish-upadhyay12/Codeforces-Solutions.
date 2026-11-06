import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int left = 0;
            int right = s.length() - 1;
            int start = -1;
            int end = -1;
 
 
            for (int i = 0; i < n / 2; i++) {
                if (s.charAt(left) != s.charAt(right)) {
                    if (start == -1)
                        start = left;
 
                    end = (n - right - 1);
                }
                left++;
                right--;
 
            }
            if (start == -1) {
                System.out.println("YES");
                t--;
                continue;
            }
            char[] ch = s.toCharArray();
 
            while (start <= end) {
                if (ch[start] == '0') {
                    ch[start] = '1';
                } else {
                    ch[start] = '0';
                }
 
 
                start++;
            }
 
            left = 0;
            right = ch.length - 1;
            boolean flag = true;
            while (left <= right) {
                if (ch[left] != ch[right]) {
 
                    flag  = false;
                   break;
                }
                left++;
                right--;
            }
            if(flag)
            System.out.println("YES");
 
            else
                System.out.println("No");
        t--;
        }
 
    }
}