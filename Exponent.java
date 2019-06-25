import java.util.*;
import java.lang.*;
import java.io.*;

public class Exponent 
{
    public static void expo(int x,int y)
    {
        double n=Math.pow(x,y);
        System.out.println(Math.round(n));
    }
	public static void main (String[] args) 
	{
	    Exponent z=new Exponent();
	    Scanner sc=new Scanner(System.in);
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	    z.expo(x,y);
	}
}
