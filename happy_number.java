import java.util.*;
public class HappyNumber {
  
    public static boolean isHappyNumber(int number) {
        int sum = 0;
        int digit;
        
        while (number > 0) {
            digit = number % 10;
            sum += digit * digit;
            number = number / 10;
        }
        
        if (sum == 1) {
            return true;
        } else if (sum == 4) {
            return false;
        } else {
            return isHappyNumber(sum);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        
        if (isHappyNumber(number)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}