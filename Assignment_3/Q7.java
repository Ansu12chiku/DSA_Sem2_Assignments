package Assignment_3;
import java.util.*;
public class Q7 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("Choose a Mathematical operation from below :");
            System.out.println("Type 1 to Determine the factorial of a number");
            System.out.println("Type 2 to Determine X^N for two numbers X, N");
            System.out.println("Type 3 to Determine GCD of two numbers");
            System.out.println("Type 4 to Binary equivalent of a decimal number");
            System.out.println("Type 5 for Product of two numbers");
            System.out.println("Type 0 For Exit\nEnter your choice:");
            choice = obj.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter a number: ");
                    int f = obj.nextInt();
                    System.out.println("Factorial of "+f+" is "+calc_Fact(f));
                    break;
                case 2:
                    System.out.print("Enter X and N : ");
                    int x = obj.nextInt();
                    int n = obj.nextInt();
                    System.out.println( "X^N = "+calc_Powerxn(x, n));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    int n1 = obj.nextInt();
                    System.out.print("Enter second number: ");
                    int n2 = obj.nextInt();
                    System.out.println("GCD of " + n1 + " and " + n2 + " is " + calc_Gcd(n1, n2));
                    break;
                case 4:
                    System.out.print("Enter a decimal number: ");
                    int decimal = obj.nextInt();
                    String binary = decimalToBinary(decimal);
                    System.out.println(decimal + " in binary is " + binary);
                    break;
                case 5:
                    System.out.print("Enter first number: ");
                    int p = obj.nextInt();
                    System.out.print("Enter second number: ");
                    int q = obj.nextInt();
                    
                    System.out.print(p + " * " + q + " = " );
                    System.out.print((p<0^q<0)?-1*calc_Product(Math.abs(p), Math.abs(q)):calc_Product(Math.abs(p), Math.abs(q)));
                    break;
                case 0:
                    System.out.println("Thank You...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

                 System.out.println();
            }while (choice != 0);
                    obj.close();
    }

            public static int calc_Fact(int n) 
            {
                if (n == 0)
                    return 1;
                else
                    return (n*calc_Fact(n - 1));
            }

            public static int calc_Powerxn(int x, int n) {
                if (n == 0)
                    return 1;
                else 
                    return  ( x*calc_Powerxn(x, n - 1));
            }

            public static int calc_Gcd(int a, int b) {
                if (b == 0)
                    return a ;
                else
                    return calc_Gcd(b, a % b);
            }

            public static String decimalToBinary(int n) {
                if (n == 0) 
                    return "0";
                else if (n == 1) 
                    return "1";
                else 
                    return decimalToBinary(n / 2) + String.valueOf(n % 2);
                
            }

            public static int calc_Product(int x,int y)
            {        
                 if (y!=0)
                    return  (x+ calc_Product(x, y-1));
                else
                    return 0;
                        
                    
            }   
 }