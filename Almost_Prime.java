import java.util.*;

public class sol {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            boolean found = false;
            for (int j = 1; j < k; j++) {
                for (int l = 1; l < k; l++) {
                    if (isprime(j) && isprime(l) && (j * l == k) && (j != l)) {
                        System.out.println("YES");
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
            if (!found) {
                System.out.println("NO");
            }
        }
    }

    public static boolean isprime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
