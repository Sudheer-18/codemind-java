import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowerBound = scanner.nextInt();
        
        int upperBound = scanner.nextInt();
        for (int number = lowerBound; number <= upperBound; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        // Check divisibility from 2 to square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
