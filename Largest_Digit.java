import java.util.*;
public class LargestDigit {
    public static int findLargestDigit(int number) {
        int largestDigit = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            number /= 10;
        }
        return largestDigit;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        int largestDigit = findLargestDigit(number);
        System.out.println(largestDigit);
    }
}
