import java.lang.*;
import java.util.*;
import java.io.*;

public class Nnumbers 
{
    public static void numbers(int N)
    {
        if(N>0)
        {
            N--;
            numbers(N);
            System.out.print((N+1)+" ");
        }
    }
	public static void main (String[] args) 
	{
	    Nnumbers z=new Nnumbers();
	    Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
		z.numbers(N);
	}
}
