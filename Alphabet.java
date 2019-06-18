import java.util.Scanner;
import java.io.*;
public class Alphabet 
{
    public static void AlphabetOrNot(char z)
    {
        if(z>='a' && z<='z')
        {
            System.out.println("Alphabet");
        }
        else
        {
            System.out.println("No");
        }
    }
    public static void main(String[] args) 
    {
        Alphabet x= new Alphabet();
        Scanner sc=new Scanner(System.in);
        char z=sc.next().charAt(0);
        x.AlphabetOrNot(z);
     }
}
