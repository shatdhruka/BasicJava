import java.util.*;
import java.lang.*;
import java.io.*;
public class LargestArray 
{
    public static void largestnumber(int a[],int n)
    {
        int x;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    x=a[i];
                    a[i]=a[j];
                    a[j]=x;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                System.out.print(a[i]);
            }
            else if(a[i]==0)
            {
                System.out.print(0);
                break;
            }
        }
    }
	public static void main (String[] args) 
	{
		LargestArray z=new LargestArray();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		z.largestnumber(a,n);
	}
}
