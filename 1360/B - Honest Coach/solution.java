import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
 
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
 
            int min = Integer.MAX_VALUE;
            Arrays.sort(arr);
 
            for (int i = 0; i < arr.length - 1; i++) {
 
                int sum = Math.abs(arr[i + 1] - arr[i]);
 
                if (sum < min) {
                    min = sum;
                }
            }
 
            System.out.println(min);
            t--;
        }
    }
}