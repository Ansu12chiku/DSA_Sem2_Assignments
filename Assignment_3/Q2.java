package Assignment_3;
import java.util.Scanner;
public class Q2 
{
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        String[] colours = new String[4];
        System.out.println("Enter four colours:");
        for (int i = 0; i < colours.length; i++) 
        {
            colours[i] = obj.nextLine();
        }
        try 
        {
           Integer.parseInt(colours[0]);
        
        } 
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        try{
        System.out.println("Enter one more color  ");
        colours[5]=obj.nextLine();
        }
         catch (ArrayIndexOutOfBoundsException e) {
             System.out.println(e);
         }
        System.out.println("The colours entered are ");
        for(int i=0;i<colours.length;i++)
        System.out.println(colours[i]);
        obj.close();
   }
}
