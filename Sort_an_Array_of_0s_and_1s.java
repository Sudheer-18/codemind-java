import java.util.*;

public class Main_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int s = 0;
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        
        
    }
}
