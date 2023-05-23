import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (isStrongNumber(number)) {
            System.out.println("The number "+number + " is a strong number");
        } else {
            System.out.println("The number "+number + " is not a strong number");
        }
    }

    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        int fact = 1;
        for (int i = 2; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}