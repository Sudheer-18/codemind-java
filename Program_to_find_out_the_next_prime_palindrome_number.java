import java.util.*;
public class primepallindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n+1;;i++)
        {
            if(ispallindrome(i))
            {
                System.out.println(i);
                break;
            }
        }
    }
    public static boolean ispallindrome(int n)
    {
        int r,s=0,temp=n;
        while(n!=0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(s==temp)
        {
            if(isprime(s))
            {
                return true;
            }
        }
        return false;
    }
    public static boolean isprime(int s)
    {
        int c=0;
        for(int i=1;i<=s;i++)
        { 
            if(s%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return true;
        }
     return  false;
    }
}