import java.util.Scanner;
import java.io.*;
public class VowelConsonant 
{
    public static void VowelConsonant(char z)
    {
        if(z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u' )
        {
            System.out.println("Vowel");
        }
        else if(z >= 'a' && z <= 'z')
        {
            System.out.println("Consonant");
        }
        else
        {
            System.out.println("invalid");
        }
    }
    public static void main(String[] args) 
    {
        VowelConsonant x= new VowelConsonant();
        Scanner sc=new Scanner(System.in);
        char z=sc.next().charAt(0);
        x.VowelConsonant(z);
     }
}
