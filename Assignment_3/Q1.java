package Assignment_3;
import java.util.*;
public class Q1
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your lucky number: ");
        int luckyno = obj.nextInt();
        try {
            if (luckyno < 0) 
            {
                throw new NumberFormatException("Negative number");
                
            }
            System.out.println("Your lucky number is: " + luckyno);
        } 
        catch (NumberFormatException e) 
        {
            System.out.println(e);
        }
        obj.close();
    }
}