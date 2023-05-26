import java.util.Scanner;

public class ArrayElementSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      //  System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

       // System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
//  System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        boolean found = searchElement(array, target);

        if (found) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean searchElement(int[] array, int target) {
        for (int element : array) {
            if (element == target) {
                return true; // Element found
            }
        }

        return false; // Element not found
    }
}
