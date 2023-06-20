package Assignment_3;
import java.util.*;
public class HW3
{
    static boolean isPalindrome(String str,int s, int e)
    {
        if (s == e)
            return true;
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;
        if (s < e + 1)
            return isPalindrome(str, s + 1, e - 1); 
        return true;
    } 
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = obj.nextLine(); 
            System.out.println(isPalindrome(str,0,str.length()-1)?"Yes it is a pallindrome String.":"No it is not a pallindrome String.");

    }
}