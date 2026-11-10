import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        sc.nextLine();
 
        while (t > 0) {
 
            String st = sc.nextLine();
            int n = st.length();
 
            if (n <= 10) {
                System.out.println(st);
                t--;
                continue;
            }
 
            int final_length = n - 2;
 
            String s = "";
            s += st.charAt(0);
            s += final_length;
            s += st.charAt(n - 1);
 
            System.out.println(s);
 
            t--;
        }
    }
}