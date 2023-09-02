import java.util.*;
import java.lang.*;
public class sample 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            String str=sc.next();
            int len=str.length();
            if(isstr(str,len))
            {
                System.out.print("YES ");
                if(len%2==0)
                {
                    System.out.print("EVEN");
                }
                else
                {
                    System.out.print("ODD");
                }
                System.out.println();
            }
            else {
                System.out.println("NO");
            }
        }
    }
    public static boolean isstr(String str,int len)
    {
        String rev="";
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)) 
        {
            return true;
        }
        return false;
    }
}
        