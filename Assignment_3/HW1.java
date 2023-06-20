package Assignment_3;
import java.util.*;
class InvalidBalanceException extends Exception
{
    InvalidBalanceException(String message)
    {
    super (message);
    }
}
class Bank 
{
    long account_no;
    String name;
    double balance;
    public Bank(int account_no, String name, double balance) throws InvalidBalanceException 
    {
        if (balance < 0) 
        {
            throw new InvalidBalanceException("Balance cannot be less than 0");
        }
        this.account_no = account_no;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InvalidBalanceException 
    {
        if (amount > balance) {
            throw new InvalidBalanceException ("Balance cannot be less than 0");
        }
        balance -= amount;
    }
    public long getAccountNo() {
        return account_no;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
public class HW1 {
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = obj.nextLine();
        System.out.println("Enter account number:");
        int account_no = obj.nextInt();
        System.out.println("Enter balance:");
        double balance = obj.nextDouble();
        try{
            Bank bank = new Bank(account_no, name, balance);
            System.out.println("Details of the Account Holder:");
            System.out.println("Name: " + bank.getName());
            System.out.println("Account number: " + bank.getAccountNo());
            System.out.println("Balance: " + bank.getBalance());
            System.out.println("Enter the money to withdraw:");
            double amount = obj.nextDouble();
            bank.withdraw(amount);
            System.out.println("After withdraw, Balance = " + bank.getBalance());
        
        } catch (InvalidBalanceException e) 
        {
            System.out.println(e);
        } 
    }
}


