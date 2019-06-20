import java.util.Scanner;
import java.io.*;

public class SumFirstKInteger
{  
    public static void SumFirst(int[] arr,int N,int K)
    {
        int sum = 0;       
        for (int i = 0; i < K; i++)
        sum+=arr[i];       
        System.out.println(sum);
    }
    public static void main(String args[])
    {
      SumFirstKInteger z=new SumFirstKInteger();
	    Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    int K=sc.nextInt();
	    int arr[]=new int[N];
	    for(int i=0; i<N; i++)
	    {
	        arr[i]=sc.nextInt();
	    }
		  z.SumFirst(arr,N,K);
    }  
}
