import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
 
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
 
            Arrays.sort(arr);
 
            int left = 0;
            boolean match = false;
            int right = left + 1;
 
            while (right < arr.length) {
                if (arr[right] - arr[left] > 1) {
                    match = true;
                    break;
                }
 
                left++;
                right++;
            }
 
            if (match)
                System.out.println("NO");
            else
                System.out.println("YES");
 
            t--;
        }
 
        sc.close();
    }
}