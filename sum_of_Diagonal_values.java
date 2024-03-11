import java.util.Scanner;
public class sol {
    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr= new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int k=0,s=0;
        for(int i=0;i<n;i++) {
            s+=arr[i][k];
            k+=1;
        }
        k=0;
        for(int i=n-1;i>=0;i--) {
            s+=arr[k][i];
            k+=1;
        }
        if(n%2!=0) {
            int val = (int) arr[n/2][n/2];
            s-=val;
        }
        System.out.println(s);
    }
}
