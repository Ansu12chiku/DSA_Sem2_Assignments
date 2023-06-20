/*Question:
Define a class called Complex with instance variables real, imag and 
instance methods setData(), display(), add(). Write a Java program to add two complex numbers.
The prototype of add method is:  public Complex add(Complex, Complex). */
package Assignment_2;
import java.util.*;
class Complex
{
    double re;
    double im;    
    void setData (double r, double i) 
    {
        re = r;
        im= i;
    }    
    void display() 
    {
        System.out.printf("%.2f %s %.2f%s\n",re,(im <0?" - ":" + ") ,Math.abs(im),"i");
    }    
    Complex add(Complex c1, Complex c2) 
    {
        Complex result = new Complex();
        result.re = c1.re + c2.re;
        result.im = c1.im + c2.im;
        return result;
    }     
}
public class Q2 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
		double r,i;
		Complex c1=new Complex();
		System.out.println("Enter real and imaginary part of 1st number separated by space :");
		r = obj.nextDouble();
        i = obj.nextDouble();
		c1.setData(r,i);
		Complex c2=new Complex();
		System.out.println("Enter real and imaginary part of 2nd number separated by space :");
		r = obj.nextDouble();
        i = obj.nextDouble();
		c2.setData(r,i);
		System.out.println("The 1st Complex number is : ");
		c1.display();
		System.out.println("The 2nd Complex number is : ");
		c2.display();
		Complex sum=new Complex();
		sum=sum.add(c1,c2);
		System.out.println("The sum is : ");
		sum.display();
        obj.close();
    }
}