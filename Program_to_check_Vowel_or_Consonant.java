import java.util.*;
public class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.nextLine().charAt(0);
        if(ch=='a'||ch=='A')
        System.out.println("Vowel");
        else if(ch=='e'||ch=='E')
        System.out.println("Vowel");
        else if(ch=='i'||ch=='I')
        System.out.println("Vowel");
        else if(ch=='o'||ch=='O')
        System.out.println("Vowel");
        else if(ch=='u'||ch=='U')
        System.out.println("Vowel");
        else
        System.out.println("Consonant");
    }
}