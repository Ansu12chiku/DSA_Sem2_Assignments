package Assignment_3;
import java.util.Scanner;
class MarksOutOfBoundException extends Exception
{
    MarksOutOfBoundException(String message)
    {
        super(message);
    }
}
class Student 
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the name of the Student :");
        String name =obj.nextLine();
        System.out.println("Enter marks ");
        try{
            double mark=obj.nextInt();
            if(mark>100)
            throw new MarksOutOfBoundException("Mark can't be greater than 100");
            System.out.println(name+" has got "+mark);
        }
        catch(MarksOutOfBoundException e)
        {
            System.out.println(e);
        }
    }
}
