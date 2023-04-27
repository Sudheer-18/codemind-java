import java.util.*;
public class avg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        float avg=(a+b)/2;
        System.out.format("%.4f",avg);
        sc.close();
    }
}