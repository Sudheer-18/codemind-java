import java.util.*;
public class solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        float s=(float)(a+b+c)/2;
        double ar=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",ar);
    }
    
}