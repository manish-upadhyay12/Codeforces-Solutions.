import java.util.Scanner;
import java.util.Arrays;
 
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
            int right = n - 1;
            int sum = 0;
 
            while (left < right) {
                sum += arr[right] - arr[left];
                left++;
                right--;
            }
 
            System.out.println(sum);
            t--;
        }
    }
}