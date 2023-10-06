import java.util.*;
public class sample {
    public static int is_odd(int n) {
    if(n%2==0)
        return 2;
    return 1;
}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(is_odd(n));
    }
}