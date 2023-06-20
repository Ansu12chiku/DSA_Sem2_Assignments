package Assignment_2;
class Deposit 
{
    long Principal;
    int Time;
    double rate;
    double Total_amt;    
    Deposit() 
    { }    
    Deposit(long Principal, int Time, double rate) 
    {
        this.Principal = Principal;
        this.Time = Time;
        this.rate = rate;
    }    
    Deposit(long Principal, int Time) 
    {
        this.Principal = Principal;
        this.Time = Time;
    }    
    Deposit(long Principal, double rate) 
    {
        this.Principal = Principal;
        this.rate =rate;
    }
    void display() 
    {
        System.out.println(Principal+"\t\t"+Time+"\t"+rate+"\t"+Total_amt);
    }
    void calc_amt()
    {
        Total_amt = Principal + ((Principal * rate * Time) / 100.0);
    }
}
public class Q5 
{
    public static void main(String[] args) 
    {
        System.out.println("Principal\t"+"Time\t"+"rate\t"+"Total_amt");
        Deposit d1 = new Deposit();
        d1.display();
        Deposit d2 = new Deposit(1000 , 2 , 5.0);
        d2.calc_amt();
        d2.display();
        Deposit d3 = new Deposit(2500 , 3 );
        d3.calc_amt();
        d3.display();
        Deposit d4 = new Deposit(4800 ,5.2 );
        d4.calc_amt();
        d4.display();
    }    
}
