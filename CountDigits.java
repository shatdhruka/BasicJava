import java.io.*;
import java.util.Scanner;
class CountDigits
{
    public static void Digits(int N)
    {
       int M=String.valueOf(N).length();
       System.out.println(M);
    }
	public static void main (String[] args) 
	{
	    CountDigits z=new CountDigits();
	    Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
		z.Digits(N);
	}
}
