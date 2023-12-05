import java.util.Scanner;
public class sum2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a,b,x,y,s=0;
        a=sc.nextInt();
        b=sc.nextInt();
        x=sc.nextInt();
        y=sc.nextInt();
        while(a<=b)
        {
            if(a%x==0 && a%y!=0)
            {
                s+=a;
            }
            a+=1;
        }
        System.out.println(s);
        sc.close();
    }
}