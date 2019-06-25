import java.util.*;
import java.lang.*;
import java.io.*;

public class Palindrome 
{
    public static int palindrome(int x)
    {
        int rev=0,rem=0,n;
        n=x;
        while(x!=0)
        {
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(n==rev)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
        return 0;
    }
	public static void main (String[] args) 
	{
	    Palindrome z=new Palindrome();
	    Scanner sc=new Scanner(System.in);
	    int x=sc.nextInt();
	    z.palindrome(x);
	}
}
