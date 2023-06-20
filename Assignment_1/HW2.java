/*
Write a Java program that takes all the lines input to standard input
and writes them to standard output in reverse order. That is, each line is output 
in the correct order, but the ordering of the lines is reversed.
*/
package Assignment_1;
import java.util.*;
public class HW2
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number of lines for input : ");
        int n=obj.nextInt();
        obj.nextLine();
        String[] s=new String[n];
        System.out.println("Enter lines : ");
        for(int i=0;i<n;i++)
            s[i]=obj.nextLine();
        System.out.println("Lines in reverse ordered are : ");
        for(int j=n-1;j>=0;j--)
            System.out.println(s[j]);
        obj.close();
    }
}