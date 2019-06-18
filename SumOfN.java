import java.util.Scanner;
import java.io.*;
public class SumOfN 
{
    public static void Sum(int z)
    {
            int x=(z*(z+1))/2;
            System.out.println(x);
    }
    public static void main(String[] args) 
    {
        SumOfN a= new SumOfN();
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        a.Sum(z);
     }
}
