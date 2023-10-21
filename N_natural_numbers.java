import java.io.*;
public class sample {
    public static void main(String args[])throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }
    }
}