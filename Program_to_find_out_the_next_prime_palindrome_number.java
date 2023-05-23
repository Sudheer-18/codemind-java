import java.util.Scanner;

public class NextPrimePalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        int nextPrimePalindrome = findNextPrimePalindrome(number);
        
        System.out.println(nextPrimePalindrome);
    }
    
    public static int findNextPrimePalindrome(int number) {
        int nextNumber = number + 1;
        
        while (true) {
            if (isPalindrome(nextNumber) && isPrime(nextNumber)) {
                return nextNumber;
            }
            
            nextNumber++;
        }
    }
    
    public static boolean isPalindrome(int number) {
        String str = Integer.toString(number);
        
        int i = 0;
        int j = str.length() - 1;
        
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            
            i++;
            j--;
        }
        
        return true;
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
