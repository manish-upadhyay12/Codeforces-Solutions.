import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
 
            int[] a1 = new int[n];
            int[] a2 = new int[n];
 
            for (int i = 0; i < n; i++) {
                a1[i] = sc.nextInt();
            }
 
            for (int i = 0; i < n; i++) {
                a2[i] = sc.nextInt();
            }
 
            Arrays.sort(a1);
            Arrays.sort(a2);
 
            int i = 0;
            int j = n - 1;
            int sum = 0;
 
            while (k > 0 && i < n && j >= 0) {
                if (a2[j] > a1[i]) {
                    sum += a2[j];
                    i++;
                    j--;
                    k--;
                } else {
                    break;
                }
            }
 
            while (i < n) {
                sum += a1[i];
                i++;
            }
 
            System.out.println(sum);
        }
 
        sc.close();
    }
}