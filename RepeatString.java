import java.util.Scanner;
import java.io.*;
public class RepeatString 
{
    public static void Repeating(int z)
    {
        for(int i=0; i<z; i++)
        {
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) 
    {
        RepeatString a= new RepeatString();
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        a.Repeating(z);
     }
}
