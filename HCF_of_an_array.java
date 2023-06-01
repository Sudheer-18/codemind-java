import java.util.Scanner;

public class HCFArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
       // System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int hcf = calculateHCF(numbers);
        System.out.println(hcf);

        scanner.close();
    }

    public static int calculateHCF(int[] numbers) {
        int hcf = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            hcf = findHCF(hcf, numbers[i]);
        }
        return hcf;
    }

    public static int findHCF(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return findHCF(num2, num1 % num2);
        }
    }
}
