import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int k = sc.nextInt();
 
        int[] arr = new int[n];
 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
 
        int kth_score = arr[k - 1];
        int no_of_participant = 0;
 
        for (int i = 0; i < n; i++) {
 
            if (arr[i] < kth_score) {
                break;
            }
 
            if (arr[i] >= kth_score && arr[i] != 0) {
                no_of_participant++;
            }
        }
 
        System.out.println(no_of_participant);
    }
}