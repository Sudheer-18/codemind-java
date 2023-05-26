import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the length of the array
        int N = scanner.nextInt();

        // Create an array of given length
        int[] arr = new int[N];

        // Read the array elements
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Read the element to be counted
        int z = scanner.nextInt();

        // Count the occurrences of the element
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == z) {
                count++;
            }
        }

        // Display the count
        System.out.println(count);

        scanner.close();
    }
}
