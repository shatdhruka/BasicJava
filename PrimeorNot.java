import java.util.*;
import java.lang.*;
import java.io.*;
public class PrimeorNot
{
    public static void prime(int m)
    {
        int flag =0;
        for(int i=2;i<m;i++)
        {
            if(m%i==0)
            {
                flag++;
                break;
            }
        }
		if(flag==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
       
    }
	public static void main (String[] args) 
	{
	    PrimeorNot z=new PrimeorNot();
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		z.prime(m);
		
	}
}
