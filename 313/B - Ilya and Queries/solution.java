import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.nextLine();
        int n = s.length();
 
        int[] pre = new int[n];
 
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1];
 
            if (s.charAt(i) == s.charAt(i - 1)) {
                pre[i]++;
            }
        }
 
        int m = sc.nextInt();
 
        while (m-- > 0) {
            int left = sc.nextInt();
            int right = sc.nextInt();
 
            System.out.println(pre[right - 1] - pre[left - 1]);
        }
 
        sc.close();
    }
}