import java.util.*;
public class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    for(int j=1;j<=n;j++)  {
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=0;
         int s=a+b;
         for(int i=1;i<=s;i++)
         {
             if(s%i==0)
             {
                 c++;
             }
         }
         if(c==2)
         {
            System.out.println("tevitt");
         }
         else
         {
            System.out.println("Satya");
         }
    }
    }
}