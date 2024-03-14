import java.util.Scanner;

public class Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isHappyNumber(n)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        // return 0;
    }

    public static boolean isHappyNumber(int n) {
    int r, s;
    while (true) {
        s = 0;
        while (n > 0) {
            r = n % 10;
            s += Math.pow(r, 2);
            n /= 10;
        }
        if (s == 1 || s == 7) return true;
        else if (s < 10) return false;
        n = s;
    }
}

}
