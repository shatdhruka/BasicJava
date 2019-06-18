import java.util.Scanner;
import java.io.*;
public class LargestAmongThree 
{
    public static void Largest(int x,int y,int z)
    {
        if(x>y && x>z)
        {
            System.out.println(x);
        }
        else if(y>x && y>z)
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(z);
        }
    }
    public static void main(String[] args) 
    {
        LargestAmongThree a= new LargestAmongThree();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        a.Largest(x,y,z);
     }
}
