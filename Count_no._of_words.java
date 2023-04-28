import java.util.Scanner;
public class count
{
    public static int findcount(String s)
    {
        int c=0,i;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
            {
                c++;
            }
        }
        return c+1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(findcount(str));
    }
}