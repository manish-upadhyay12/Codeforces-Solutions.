import java.util.*;
 
public class Main {
    public static int check(int y) {
        int original = y;
        HashSet<Integer> set = new HashSet<>();
 
        while (y > 0) {
            if (set.contains(y % 10)) {
                break;
            }
 
            set.add(y % 10);
            y /= 10;
        }
 
        if (set.size() == 4) {
            return original;
        }
 
        return check(original + 1);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        System.out.println(check(n + 1));
 
        sc.close();
    }
}