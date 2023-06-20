package Assignment_2;
import java.util.*;
class Commission 
{
    double sales;    
    Commission(double sales) 
    {
        this.sales = sales;
    }
    
    public double getCommission() 
    {
        if (sales <0)
        {
            System.out.println("Invalid Input");
            return 0; 
        }
        else if (sales < 100) 
            return 0.02 * sales;
        else if (sales < 5000) 
            return 0.05 * sales;
        else 
            return 0.08 * sales;
        
    }
}
class Demo 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);        
        System.out.print("Enter the sale: ");
        double sale = obj.nextDouble();
        
        Commission com = new Commission(sale);
        double com_amt = com.getCommission();
        
        if (com_amt > 0)
            System.out.println("The commission is Rs " + com_amt);
    }
}