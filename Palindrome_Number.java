import java.util.*;

public class nextpallindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {    
            int m=sc.nextInt();
            if (ispallindrome(m)) {
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
        }
    }

    public static boolean ispallindrome(int n) {
        int m = n;
        int r, s = 0;
        while (n != 0) {
            r = n % 10;
            s = s * 10 + r;
            n = n / 10;
        }
        if(s==m)
        {
            return true;
        }
        return false;
    }
}
