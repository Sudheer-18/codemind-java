import java.util.*;
public class sal{
    public static void main(String agrs[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(m*30<=n)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}