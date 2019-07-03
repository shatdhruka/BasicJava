import java.util.*;
import java.lang.*;
import java.io.*;
public class RepeatedNumber 
{
    public static void repeatandsort(int a[],int n)
    {
        int x;
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    b[i]=a[i];
                    
                }
                if(b[i]<b[j])
                {
                    x=b[i];
                    b[i]=b[j];
                    b[j]=x;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(b[i]!=0)
            {
                System.out.print(b[i]+" ");
            }
        }
    }
	public static void main (String[] args) 
	{
		RepeatedNumber z=new RepeatedNumber();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		z.repeatandsort(a,n);
	}
}
