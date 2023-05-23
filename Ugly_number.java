import java.util.*;
public class UglyNumber {
  
    public static boolean isUgly(int number) {
        if (number <= 0) {
            return false;
        }
        
        while (number % 2 == 0) {
            number /= 2;
        }
        
        while (number % 3 == 0) {
            number /= 3;
        }
        
        while (number % 5 == 0) {
            number /= 5;
        }
        
        return number == 1;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();
        
        if (isUgly(number)) {
            System.out.println("Ugly Number");
        } else {
            System.out.println("Not Ugly Number");
        }
    }
}
