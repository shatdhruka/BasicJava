import java.util.Scanner;
import java.io.*;
public class LeapYear 
{
    public static void Year(int z)
    {
        if((z%400==0)||(z%4==0) && (z%100!=0))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
    public static void main(String[] args) 
    {
        LeapYear a= new LeapYear();
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        a.Year(z);
     }
}
