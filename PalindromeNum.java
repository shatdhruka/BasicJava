import java.io.*;
import java.util.*;
import java.lang.*;
class GFG 
{
    public static void Palindrome(int n)
    {
        int a,b=0;
        int temp=n;
        while(n>0)
        {
            a=n%10;
            b=(b*10)+a;
            n=n/10;
        }
        if(temp==b)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
	public static void main (String[] args) 
	{
	    GFG z=new GFG();
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    z.Palindrome(n);
		
	}
}
