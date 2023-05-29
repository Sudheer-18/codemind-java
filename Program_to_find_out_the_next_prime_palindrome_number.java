import java.util.*;

public class nextprimepallindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n + 1; i > 0; i++) {
            if (ispallindrome(i)) {
                System.out.println(i);
                break;
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
        if (s == m) {
            if (isprime(s)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isprime(int n) {
        int c = 0, i;
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return true;
        }
        return false;
    }
}
