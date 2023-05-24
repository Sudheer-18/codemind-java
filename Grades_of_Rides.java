import java.util.*;
public class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int g1=sc.nextInt();
        int g2=sc.nextInt();
        int g3=sc.nextInt();
        if(g1>50&&g2>60&&g3>100)
        System.out.println("10");
        else if(g1>50&&g2>60)
        System.out.println("9");
        else if(g2>60&&g3>100)
        System.out.println("8");
        else if(g1>50&&g3>100)
        System.out.println("7");
        else if(g1>50||g2>60||g3>100)
        System.out.println("6");
        else
        System.out.println("5");
    }
}