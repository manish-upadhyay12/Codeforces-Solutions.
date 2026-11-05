import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
 
		while(t>0) {
			int n = sc.nextInt();
			sc.nextLine();
			String s = sc.nextLine();
 
 
			int left= 0;
			int right = 1;
			String st= "";
 
			
			while(right<s.length()) {
				
				char ch1 = s.charAt(left);
				char ch2 = s.charAt(right);
				if(ch1==ch2) {
					st+=ch1;
					left = right+1;
					right+=2;
				}
				else {
					right++;
				}
			}
			System.out.println(st);
			t--;
		}
	}
}