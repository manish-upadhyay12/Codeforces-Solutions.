 
import java.util.*;
public class Main
{
	public static boolean vowel(char ch) {
    ch = Character.toLowerCase(ch);
 
    return ch == 'a' || ch == 'e' || ch == 'i' ||
           ch == 'o' || ch == 'u' || ch == 'y';
}
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
 
 
		String s  = sc.nextLine();
		String res = "";
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
 
			if(vowel(ch)) {
				continue;
			}
 
		
			ch = Character.toLowerCase(ch);
			res += '.';
			res+= ch;
		}
		System.out.println(res);
	}
 
 
}
 
 
 
 
 
 
 
 
 
 
 
 