import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String s = sc.next();
            int countw = 0;
            int i = 0;
            while(i<k){
                if(s.charAt(i)=='W'){
                    countw++;
                }
                i++;
            }
            int min = countw;
            int left = 0;
            for(int j = k;j<s.length();j++){
                if(s.charAt(left)=='W'){
                    countw-=1;
                }
                left++;
                if(s.charAt(j)=='W'){
                    countw++;
                }
                min = Math.min(min,countw);
            }
            System.out.println(min);
            t--;
    }
}
}