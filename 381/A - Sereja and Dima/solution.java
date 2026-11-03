import java.util.*;
public class Main {
public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n  = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            int sereja_score = 0;
            int dima = 0;
            int left = 0;
            int right = arr.length-1;
            int pos = 1;
 
            while(left<=right){
                int max = Math.max(arr[left],arr[right]);
 
                if(pos%2!=0){
                    sereja_score += max;
                }
                else{
                    dima += max;
                }
                pos++;
                if(arr[left]>arr[right]){
                   left++;
 
                }
                else{
                    right--;
                }
 
 
            }
        System.out.println(sereja_score + " " + dima);
 
 
    }
}