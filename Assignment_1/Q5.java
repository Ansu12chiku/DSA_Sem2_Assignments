/*
Write a java method to calculate the sum of digits of a given number until the number
is a single digit. The method signature is as follows.
public static int sum_Of_Digits(int n)
*/
package Assignment_1;
import java.util.*;
public class Q5
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int x=obj.nextInt();
		System.out.print(  "Sum of digits of "+x
						 + " until the number is a"
				         + " single digit is "+sum_Of_Digits(x));
		obj.close();
	}
	public static int sum_Of_Digits(int n) 
	{
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum+=r;
			n/=10;
		}
		if(sum>=10)
			return sum_Of_Digits(sum);
		else
			return sum;
		
	}

}