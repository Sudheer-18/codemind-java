import java.util.*;

public class nextpallindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = n; i < m; i++) {
            if (ispallindrome(i)) {
                System.out.print(i+" ");
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
        return s == m;
    }
}
