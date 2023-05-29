import java.util.*;
public class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int ele=majority(a);
        System.out.println(ele);
    }
    public static int majority(int arr[])
    {
        int c=0,ele=0;
        for(int n:arr)
        {
            if(c==0)  {
              ele=n;
              c=1;
            }
            else if(ele==n)
            {
                c++;
            }
            else
            {
                c--;
            }
        }
    
      return ele;
    }
}