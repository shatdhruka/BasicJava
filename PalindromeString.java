import java.io.*;
import java.util.*;
import java.lang.*;

class PalindromeString
{
    public static void Palindrome(String n)
    {
        int a=n.length();
        String b="";
        for(int i=a-1;i>=0;i--)
        {
           b = b + n.charAt(i);
        }
        if(n.equals(b))
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
	    PalindromeString z=new PalindromeString();
	    Scanner sc=new Scanner(System.in);
	    String n=sc.nextLine();
	    z.Palindrome(n);
		
	}
}
