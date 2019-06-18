import java.util.*;
import java.lang.*;
import java.io.*;

public class LargestPrefix
{
    public static void CommonPrefix(String z[], int n)
    {
       int s=z[0].length();
		   for(int i=1;i<n;i++)
		   {
			    char a[]=z[i-1].toCharArray();
			    char b[]=z[i].toCharArray();
			    int c=z[i-1].length();
			    int d=z[i].length();
			    if(c<=d && c<s)
			    {
				      s=c;
			    }
			    if(c>d && d<s)
			    {
				      s=d;
			    }
			    for(int j=0;j<s;j++)
			    {
				      if(a[j]!=b[j])
				      {
                  s=j;
                  j=s;
				      }
			    }
		    }
		    char a[]=z[0].toCharArray();
		    for(int i=0; i<s; i++)
		    {
			    System.out.print(a[i]);
		    }
    }
	public static void main (String[] args) 
	{
	  LargestPrefix l=new LargestPrefix();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String z[]=new String[n];
		for(int i=0;i<n;i++)
		{
			z[i]=sc.next();
		}
		l.CommonPrefix(z,n);
	}
}
