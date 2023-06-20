/*
Write a java program to check whether a number is a spy number or not.
*/
package Assignment_1;
import java.util.*;
public class Q3 
{
		public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=obj.nextInt();
		int sum=0,product=1,t=n;
		while(n>0)
		{
			int r=n%10;
			sum+=r;
			product*=r;
			n/=10;
		}
		if(sum==product)
			System.out.print(t+" is a spy number");
		else
			System.out.print(t+" is not a spy number");
		obj.close();
	}

}