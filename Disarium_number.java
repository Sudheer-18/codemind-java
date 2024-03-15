import java.util.*;
// import java.math;
public class sol {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r,s=0,t=n;
        int k=(int)Math.log10(n)+1;
        while(n!=0) {
            r=n%10;
            s+=Math.pow(r,k);
            n/=10;
            k-=1;
        }
        if(s==t) System.out.println("True");
        else System.out.println("False");
    }
}