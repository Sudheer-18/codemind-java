import java.util.*;

public class sudheer {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s1 = "";
        int f = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '6' && f == 0) {
                s1 += "9";
                f = 1;
            } else {
                s1 += str.charAt(i);
            }
        }
        
        System.out.println(s1);
    }
}
